package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;

/* compiled from: NewsfeedPlaceholderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class ov60 extends ol60 {
    public final CharSequence h;
    public final CharSequence i;
    public final boolean j;
    public final int k;
    public final NewsfeedExternalAction l;
    public final int m;

    public ov60(String str, String str2, boolean z, int i, NewsfeedExternalAction.Navigation navigation, int i2) {
        super(1104, 0, i2, 0, null);
        this.h = str;
        this.i = str2;
        this.j = z;
        this.k = i;
        this.l = navigation;
        this.m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov60)) {
            return false;
        }
        ov60 ov60Var = (ov60) obj;
        return epx.f(this.h, ov60Var.h) && epx.f(this.i, ov60Var.i) && this.j == ov60Var.j && this.k == ov60Var.k && epx.f(this.l, ov60Var.l) && this.m == ov60Var.m;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.m;
    }

    public final int hashCode() {
        CharSequence charSequence = this.h;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.i;
        int a = shy.a(this.k, qoy.b((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.j), 31);
        NewsfeedExternalAction newsfeedExternalAction = this.l;
        return Integer.hashCode(this.m) + ((a + (newsfeedExternalAction != null ? newsfeedExternalAction.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedPlaceholderHolderUiDto(text=");
        sb.append((Object) this.h);
        sb.append(", buttonText=");
        sb.append((Object) this.i);
        sb.append(", isButtonVisible=");
        sb.append(this.j);
        sb.append(", height=");
        sb.append(this.k);
        sb.append(", buttonAction=");
        sb.append(this.l);
        sb.append(", seqId=");
        return vu5.b(sb, this.m, ')');
    }
}
