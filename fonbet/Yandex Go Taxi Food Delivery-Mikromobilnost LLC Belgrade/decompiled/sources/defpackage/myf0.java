package defpackage;

/* loaded from: classes15.dex */
public final class myf0 extends k9v {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public myf0(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = "ReactionsChooserBrick";
                this.c = str;
                break;
            default:
                this.b = "PublicReactionViewHolder";
                this.c = str;
                break;
        }
    }

    @Override // defpackage.k9v
    public final void c(mav mavVar) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                if (ydz.a.a()) {
                    ydz.b(str2, "Failed to load reaction image. url=" + str + ", error=" + mavVar);
                    break;
                }
                break;
            default:
                if (ydz.a.a()) {
                    ydz.b(str2, "Failed to load reaction image. url=" + str + ", error=" + mavVar.a);
                    break;
                }
                break;
        }
    }
}
