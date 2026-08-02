package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: ClipsTemplateGalleryPickerPreviewAdapter.kt */
/* loaded from: classes5.dex */
public final class q8f {
    public static final a a = new a();

    /* compiled from: ClipsTemplateGalleryPickerPreviewAdapter.kt */
    public static final class a extends m.e<a8f> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(a8f a8fVar, a8f a8fVar2) {
            return a8fVar.equals(a8fVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(a8f a8fVar, a8f a8fVar2) {
            return a8fVar.a == a8fVar2.a;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ Object getChangePayload(a8f a8fVar, a8f a8fVar2) {
            return s3q0.a;
        }
    }
}
