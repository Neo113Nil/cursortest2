package xsna;

/* compiled from: VideoInfoSegmentsConfig.kt */
/* loaded from: classes14.dex */
public final class fqs0 {
    public final Integer a;
    public final CharSequence b;
    public final a c;

    /* compiled from: VideoInfoSegmentsConfig.kt */
    public static final class a {
        public final CharSequence a;

        public a(CharSequence charSequence) {
            this.a = charSequence;
        }
    }

    public fqs0(Integer num, CharSequence charSequence, a aVar, int i) {
        num = (i & 1) != 0 ? null : num;
        charSequence = (i & 2) != 0 ? null : charSequence;
        aVar = (i & 4) != 0 ? null : aVar;
        this.a = num;
        this.b = charSequence;
        this.c = aVar;
    }
}
