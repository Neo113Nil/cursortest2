package com.yandex.passport.common.resources;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.wuj0;
import defpackage.yma1;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0005J\u001a\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006'"}, d2 = {"Lcom/yandex/passport/common/resources/DrawableResource;", "Landroid/os/Parcelable;", "", "resId", "constructor-impl", "(I)I", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "drawableForContext-impl", "(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;", "drawableForContext", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel-impl", "(ILandroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "describeContents", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", CA20Status.STATUS_USER_I, "getResId", "()I", "getDrawable-impl", "(I)Landroid/graphics/drawable/Drawable;", "drawable", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DrawableResource implements Parcelable {
    public static final Parcelable.Creator<DrawableResource> CREATOR = new Creator();
    private final int resId;

    private /* synthetic */ DrawableResource(int i) {
        this.resId = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DrawableResource m264boximpl(int i) {
        return new DrawableResource(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m265constructorimpl(int i) {
        return i;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m266describeContentsimpl(int i) {
        return 0;
    }

    /* renamed from: drawableForContext-impl, reason: not valid java name */
    public static final Drawable m267drawableForContextimpl(int i, Context context) {
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = wuj0.a;
        Drawable b = yma1.b(resources, i, theme);
        if (b != null) {
            return b;
        }
        ny61.r(qv10.g(i, "can't get drawable for resource "));
        return null;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m268equalsimpl(int i, Object obj) {
        return (obj instanceof DrawableResource) && i == ((DrawableResource) obj).m274unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m269equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getDrawable-impl, reason: not valid java name */
    public static final Drawable m270getDrawableimpl(int i) {
        return m267drawableForContextimpl(i, com.yandex.passport.common.util.a.b());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m271hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m272toStringimpl(int i) {
        return oyr.e(')', i, "DrawableResource(resId=");
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m273writeToParcelimpl(int i, Parcel parcel, int i2) {
        parcel.writeInt(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m266describeContentsimpl(this.resId);
    }

    public boolean equals(Object obj) {
        return m268equalsimpl(this.resId, obj);
    }

    public final int getResId() {
        return this.resId;
    }

    public int hashCode() {
        return m271hashCodeimpl(this.resId);
    }

    public String toString() {
        return m272toStringimpl(this.resId);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m274unboximpl() {
        return this.resId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m273writeToParcelimpl(this.resId, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DrawableResource> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrawableResource createFromParcel(Parcel parcel) {
            return DrawableResource.m264boximpl(m275createFromParcelhU_L6dY(parcel));
        }

        /* renamed from: createFromParcel-hU_L6dY, reason: not valid java name */
        public final int m275createFromParcelhU_L6dY(Parcel parcel) {
            return DrawableResource.m265constructorimpl(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DrawableResource[] newArray(int i) {
            return new DrawableResource[i];
        }
    }
}
