package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import xsna.e57;

/* compiled from: VkTouchIdHelper.kt */
/* loaded from: classes6.dex */
public final class quv0 {
    public String a;
    public String b;
    public izs<? super e57.b, s3q0> c;
    public gzs<s3q0> d;
    public gzs<s3q0> e;

    /* compiled from: VkTouchIdHelper.kt */
    public static final class a extends e57.a {
        public a() {
        }

        @Override // xsna.e57.a
        public final void a(int i, CharSequence charSequence) {
            gzs<s3q0> gzsVar = quv0.this.d;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // xsna.e57.a
        public final void b() {
            gzs<s3q0> gzsVar = quv0.this.e;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // xsna.e57.a
        public final void c(e57.b bVar) {
            izs<? super e57.b, s3q0> izsVar = quv0.this.c;
            if (izsVar != null) {
                izsVar.invoke(bVar);
            }
        }
    }

    public final void a(FragmentActivity fragmentActivity) {
        e57 e57Var = new e57(fragmentActivity, fragmentActivity.getMainExecutor(), new a());
        e57.d.a aVar = new e57.d.a();
        String str = this.a;
        if (str == null) {
            str = "";
        }
        aVar.a = str;
        aVar.b = this.b;
        aVar.d = fragmentActivity.getString(R.string.cancel);
        e57Var.b(aVar.a(), null);
    }
}
