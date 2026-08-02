package com.yandex.div.core.util;

import xsna.epx;
import xsna.vby;

/* compiled from: ImageRepresentation.kt */
/* loaded from: classes7.dex */
public interface ImageRepresentation {

    /* compiled from: ImageRepresentation.kt */
    @vby
    public static final class Bitmap implements ImageRepresentation {
        private final android.graphics.Bitmap value;

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m122boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m124equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && epx.f(bitmap, ((Bitmap) obj).m127unboximpl());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m125hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m126toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m124equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m125hashCodeimpl(this.value);
        }

        public String toString() {
            return m126toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.Bitmap m127unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m123constructorimpl(android.graphics.Bitmap bitmap) {
            return bitmap;
        }
    }

    /* compiled from: ImageRepresentation.kt */
    @vby
    public static final class PictureDrawable implements ImageRepresentation {
        private final android.graphics.drawable.PictureDrawable value;

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m128boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m130equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && epx.f(pictureDrawable, ((PictureDrawable) obj).m133unboximpl());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m131hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m132toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m130equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m131hashCodeimpl(this.value);
        }

        public String toString() {
            return m132toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable m133unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m129constructorimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable;
        }
    }
}
