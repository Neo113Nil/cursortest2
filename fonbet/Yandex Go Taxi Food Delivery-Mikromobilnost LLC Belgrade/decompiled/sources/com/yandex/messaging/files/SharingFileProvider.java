package com.yandex.messaging.files;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.e1r;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.kbs;
import defpackage.kqr0;
import defpackage.l76;
import defpackage.nqr0;
import defpackage.ny61;
import defpackage.onp0;
import defpackage.qhq0;
import defpackage.scc;
import defpackage.unr0;
import defpackage.z8g;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/yandex/messaging/files/SharingFileProvider;", "Landroidx/core/content/FileProvider;", "<init>", "()V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Ljava/io/File;", "tryGetFileByUri", "(Landroid/net/Uri;)Ljava/io/File;", "", "mode", "", "modeToMode", "(Ljava/lang/String;)I", "Landroid/os/ParcelFileDescriptor;", "openFile", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;", "", "proj", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "", "Le1r;", "fileProviderHelpers$delegate", "Li3y;", "getFileProviderHelpers", "()Ljava/util/List;", "fileProviderHelpers", "Companion", "kqr0", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SharingFileProvider extends FileProvider {
    public static final int $stable = 8;

    /* renamed from: fileProviderHelpers$delegate, reason: from kotlin metadata */
    private final i3y fileProviderHelpers = a.a(new qhq0(8, this));
    public static final kqr0 Companion = new kqr0();
    private static final String[] COLUMNS = {"_display_name", "_size"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fileProviderHelpers_delegate$lambda$1(SharingFileProvider sharingFileProvider) {
        Context context = sharingFileProvider.getContext();
        if (context != null) {
            return scc.g(new e1r((nqr0) ((z8g) onp0.a(context)).V.get()), new e1r(l76.R));
        }
        ny61.g("context is null in SharingFileProvider");
        return null;
    }

    private final List<e1r> getFileProviderHelpers() {
        return (List) this.fileProviderHelpers.getValue();
    }

    private final int modeToMode(String mode) {
        if ("r".equals(mode)) {
            return SelfTester_JCP.IMITA;
        }
        if ("w".equals(mode) || "wt".equals(mode)) {
            return 738197504;
        }
        if ("wa".equals(mode)) {
            return 704643072;
        }
        if ("rw".equals(mode)) {
            return 939524096;
        }
        if ("rwt".equals(mode)) {
            return 1006632960;
        }
        ny61.g(g8e.o("Invalid mode: ", mode));
        return 0;
    }

    private final File tryGetFileByUri(Uri uri) {
        Iterator<T> it = getFileProviderHelpers().iterator();
        while (it.hasNext()) {
            File a = ((e1r) it.next()).a(getContext(), uri);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        File tryGetFileByUri = tryGetFileByUri(uri);
        if (tryGetFileByUri != null && tryGetFileByUri.exists() && tryGetFileByUri.isFile()) {
            return ParcelFileDescriptor.open(tryGetFileByUri, modeToMode(mode));
        }
        throw new FileNotFoundException(uri.toString());
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public Cursor query(Uri uri, String[] proj, String selection, String[] selectionArgs, String sortOrder) {
        if (proj == null) {
            proj = COLUMNS;
        }
        File tryGetFileByUri = tryGetFileByUri(uri);
        if (tryGetFileByUri == null) {
            kbs.g(unr0.n(uri, "File not found by uri "));
            return null;
        }
        ArrayList arrayList = new ArrayList(proj.length);
        ArrayList arrayList2 = new ArrayList(proj.length);
        for (String str : proj) {
            if ("_display_name".equals(str)) {
                arrayList.add("_display_name");
                arrayList2.add(tryGetFileByUri.getName());
            } else if ("_size".equals(str)) {
                arrayList.add("_size");
                arrayList2.add(Long.valueOf(tryGetFileByUri.length()));
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor((String[]) arrayList.toArray(new String[0]));
        matrixCursor.addRow(arrayList2);
        return matrixCursor;
    }
}
