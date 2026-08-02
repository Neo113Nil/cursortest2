package com.fluttercandies.photo_manager.core;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.bvu0;
import defpackage.ooc;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"com/fluttercandies/photo_manager/core/PhotoManagerNotifyChannel$MediaObserver", "Landroid/database/ContentObserver;", "", "type", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/fluttercandies/photo_manager/core/a;ILandroid/os/Handler;)V", "", "id", "Lkotlin/Pair;", "", "getGalleryIdAndName", "(JI)Lkotlin/Pair;", "", "selfChange", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lzy11;", "onChange", "(ZLandroid/net/Uri;)V", CA20Status.STATUS_USER_I, "getType", "()I", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/content/ContentResolver;", "getCr", "()Landroid/content/ContentResolver;", "cr", "photo_manager_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
final class PhotoManagerNotifyChannel$MediaObserver extends ContentObserver {
    final /* synthetic */ a this$0;
    private final int type;
    private Uri uri;

    public /* synthetic */ PhotoManagerNotifyChannel$MediaObserver(a aVar, int i, Handler handler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i, (i2 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    private final Pair<Long, String> getGalleryIdAndName(long id, int type) {
        Cursor query = getCr().query(this.this$0.f, new String[]{"bucket_id", "bucket_display_name"}, "_id = ?", new String[]{String.valueOf(id)}, null);
        if (query != null) {
            Cursor cursor = query;
            try {
                Cursor cursor2 = cursor;
                if (query.moveToNext()) {
                    long j = query.getLong(query.getColumnIndex("bucket_id"));
                    Pair<Long, String> pair = new Pair<>(Long.valueOf(j), query.getString(query.getColumnIndex("bucket_display_name")));
                    cursor.close();
                    return pair;
                }
                cursor.close();
            } finally {
            }
        }
        return new Pair<>(null, null);
    }

    public final Context getContext() {
        return this.this$0.a;
    }

    public final ContentResolver getCr() {
        return getContext().getContentResolver();
    }

    public final int getType() {
        return this.type;
    }

    public final Uri getUri() {
        return this.uri;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, Uri uri) {
        if (uri == null) {
            return;
        }
        String lastPathSegment = uri.getLastPathSegment();
        Long m = lastPathSegment != null ? bvu0.m(10, lastPathSegment) : null;
        if (m == null) {
            this.this$0.a(uri, "delete", null, null, this.type);
            return;
        }
        Cursor query = getCr().query(this.this$0.f, new String[]{"date_added", "date_modified", "media_type"}, "_id = ?", new String[]{m.toString()}, null);
        if (query != null) {
            Cursor cursor = query;
            a aVar = this.this$0;
            try {
                Cursor cursor2 = cursor;
                if (!query.moveToNext()) {
                    aVar.a(uri, "delete", m, null, this.type);
                    cursor.close();
                    return;
                }
                String str = (System.currentTimeMillis() / 1000) - query.getLong(query.getColumnIndex("date_added")) < 30 ? "insert" : "update";
                int i = query.getInt(query.getColumnIndex("media_type"));
                Pair<Long, String> galleryIdAndName = getGalleryIdAndName(m.longValue(), i);
                Long l = (Long) galleryIdAndName.getFirst();
                String str2 = (String) galleryIdAndName.getSecond();
                if (l != null && str2 != null) {
                    aVar.a(uri, str, m, l, i);
                    cursor.close();
                    return;
                }
                cursor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ooc.g(cursor, th);
                    throw th2;
                }
            }
        }
    }

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoManagerNotifyChannel$MediaObserver(a aVar, int i, Handler handler) {
        super(handler);
        this.this$0 = aVar;
        this.type = i;
        this.uri = Uri.parse("content://media");
    }
}
