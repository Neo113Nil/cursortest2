package xsna;

/* compiled from: ClipUploadItem.kt */
/* loaded from: classes17.dex */
public final class pdf {
    public final int a;
    public final tlo0 b;
    public final Integer c;

    public pdf(int i, tlo0 tlo0Var, Integer num) {
        this.a = i;
        this.b = tlo0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdf)) {
            return false;
        }
        pdf pdfVar = (pdf) obj;
        return this.a == pdfVar.a && epx.f(this.b, pdfVar.b) && epx.f(this.c, pdfVar.c);
    }

    public final int hashCode() {
        int a = com.vk.movika.sdk.base.model.history.b.a(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadCellSuggestedItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", icon=");
        return uqi.b(sb, this.c, ')');
    }
}
