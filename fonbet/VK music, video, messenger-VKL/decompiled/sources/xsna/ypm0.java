package xsna;

import android.text.style.URLSpan;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ypm0 implements i9z {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ypm0(int i, Object obj, izs izsVar) {
        this.b = i;
        this.c = izsVar;
        this.d = obj;
    }

    @Override // xsna.i9z
    public final void a(q8z q8zVar) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(str);
                    break;
                }
                break;
            default:
                this.c.invoke(((URLSpan) this.d).getURL());
                break;
        }
    }
}
