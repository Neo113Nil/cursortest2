package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BirthdaysListAdapter.kt */
/* loaded from: classes15.dex */
public final class ja7 extends sxm {
    public final np1 i;

    /* compiled from: BirthdaysListAdapter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ViewGroup, bb7> {
        public static final a b = new a(1, bb7.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final bb7 invoke(ViewGroup viewGroup) {
            return new bb7(viewGroup);
        }
    }

    /* compiled from: BirthdaysListAdapter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ViewGroup, sa7> {
        public static final b b = new b(1, sa7.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final sa7 invoke(ViewGroup viewGroup) {
            return new sa7(R.layout.vk_view_default_list_loading, viewGroup);
        }
    }

    public ja7(np1 np1Var) {
        this.i = np1Var;
        x0(jb7.class, a.b);
        x0(ib7.class, new t40(this, 5));
        x0(hb7.class, b.b);
        x0(gb7.class, new v9(this, 8));
        setHasStableIds(true);
    }
}
