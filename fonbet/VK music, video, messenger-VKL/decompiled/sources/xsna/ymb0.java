package xsna;

import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.PollBackground;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: PollBackgroundAdapter.kt */
/* loaded from: classes4.dex */
public final class ymb0 extends ng<PollBackground> implements jnb0 {
    public final fa6 g;
    public final boolean h;
    public final ArrayList i;
    public final boolean j;
    public Object k;

    /* compiled from: PollBackgroundAdapter.kt */
    public static final /* synthetic */ class a extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ymb0) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ymb0) this.receiver).N0(obj);
        }
    }

    /* compiled from: PollBackgroundAdapter.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ymb0) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ymb0) this.receiver).N0(obj);
        }
    }

    /* compiled from: PollBackgroundAdapter.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ymb0) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ymb0) this.receiver).N0(obj);
        }
    }

    /* compiled from: PollBackgroundAdapter.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ymb0) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ymb0) this.receiver).N0(obj);
        }
    }

    /* compiled from: PollBackgroundAdapter.kt */
    public static final /* synthetic */ class e extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ymb0) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ymb0) this.receiver).N0(obj);
        }
    }

    /* compiled from: PollBackgroundAdapter.kt */
    public static final /* synthetic */ class f extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ymb0) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ymb0) this.receiver).N0(obj);
        }
    }

    public ymb0(fa6 fa6Var, boolean z, its itsVar) {
        super(itsVar);
        this.g = fa6Var;
        this.h = z;
        this.i = new ArrayList();
        this.j = nub0.a().b();
    }

    @Override // xsna.ng
    public final Object K0() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.ng
    public final void N0(Object obj) {
        Object obj2 = this.k;
        if (obj2 == null) {
            this.f = 0;
            notifyItemChanged(0, Boolean.FALSE);
        } else {
            Object obj3 = null;
            if (obj2 instanceof PollBackground) {
                Iterator it = j5g.W0(((ListDataSet) this.c).d).iterator();
                while (true) {
                    ztw ztwVar = (ztw) it;
                    if (!ztwVar.b.hasNext()) {
                        break;
                    }
                    Object next = ztwVar.next();
                    if (((PollBackground) ((xtw) next).b).b == ((PollBackground) obj2).b) {
                        obj3 = next;
                        break;
                    }
                }
                xtw xtwVar = (xtw) obj3;
                if (xtwVar != null) {
                    int i = xtwVar.a + 1;
                    this.f = i;
                    notifyItemChanged(i, Boolean.FALSE);
                }
            } else if (obj2 instanceof inb0) {
                Iterator it2 = j5g.W0(this.i).iterator();
                while (true) {
                    ztw ztwVar2 = (ztw) it2;
                    if (!ztwVar2.b.hasNext()) {
                        break;
                    }
                    Object next2 = ztwVar2.next();
                    if (epx.f(((xtw) next2).b, obj2)) {
                        obj3 = next2;
                        break;
                    }
                }
                xtw xtwVar2 = (xtw) obj3;
                if (xtwVar2 != null) {
                    int O0 = O0(xtwVar2.a);
                    this.f = O0;
                    notifyItemChanged(O0, Boolean.FALSE);
                }
            }
        }
        this.k = obj;
        this.e.invoke();
    }

    public final int O0(int i) {
        return ((ListDataSet) this.c).d.size() + i + 1;
    }

    @Override // xsna.jnb0
    public final void c0(inb0 inb0Var) {
        this.i.add(inb0Var);
        N0(inb0Var);
        notifyItemInserted(O0(r0.size() - 1));
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ListDataSet listDataSet = (ListDataSet) this.c;
        if (listDataSet.d.isEmpty()) {
            return 0;
        }
        return this.i.size() + listDataSet.d.size() + (this.j ? 2 : 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        uuk uukVar = this.c;
        if (i2 < ((ListDataSet) uukVar).d.size()) {
            return 1;
        }
        return i2 - ((ListDataSet) uukVar).d.size() < this.i.size() ? 2 : 3;
    }

    @Override // xsna.jnb0
    public final hfr m() {
        return rli0.m(new ulp0(rli0.j(new i5g(this.i), new c4r(24)), new c220(13)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        boolean z = e0Var instanceof cnb0;
        uuk uukVar = this.c;
        if (z) {
            PollBackground pollBackground = (PollBackground) j5g.b0(i - 1, ((ListDataSet) uukVar).d);
            if (pollBackground != null) {
                ((cnb0) e0Var).V5(pollBackground);
                return;
            }
            return;
        }
        boolean z2 = e0Var instanceof knb0;
        ArrayList arrayList = this.i;
        if (z2) {
            inb0 inb0Var = (inb0) j5g.b0((i - 1) - ((ListDataSet) uukVar).d.size(), arrayList);
            if (inb0Var != null) {
                ((knb0) e0Var).V5(inb0Var);
                return;
            }
            return;
        }
        if (e0Var instanceof ptb0) {
            ((ptb0) e0Var).V5(null);
            return;
        }
        if (e0Var instanceof qrb0) {
            ((qrb0) e0Var).V5(s3q0.a);
            return;
        }
        if (e0Var instanceof qtb0) {
            ((qtb0) e0Var).V5(null);
            return;
        }
        if (e0Var instanceof fqb0) {
            ((fqb0) e0Var).V5(j5g.b0(i - 1, ((ListDataSet) uukVar).d));
        } else if (e0Var instanceof hqb0) {
            ((hqb0) e0Var).V5(j5g.b0((i - 1) - ((ListDataSet) uukVar).d.size(), arrayList));
        } else if (e0Var instanceof rrb0) {
            ((rrb0) e0Var).V5(s3q0.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z = this.h;
        fa6 fa6Var = this.g;
        if (!z) {
            if (i != 0) {
                return i != 1 ? i != 2 ? i != 3 ? new qrb0(viewGroup, fa6Var) : new qrb0(viewGroup, fa6Var) : new knb0(viewGroup, new f(this, ymb0.class, "selectionItem", "getSelectionItem()Ljava/lang/Object;", 0)) : new cnb0(viewGroup, new e(this, ymb0.class, "selectionItem", "getSelectionItem()Ljava/lang/Object;", 0));
            }
            ptb0 ptb0Var = new ptb0(R.layout.poll_default_bg_view, viewGroup, new d(this, ymb0.class, "selectionItem", "getSelectionItem()Ljava/lang/Object;", 0));
            ImageView imageView = (ImageView) ptb0Var.itemView.findViewById(R.id.poll_backgorund_iv);
            imageView.setImageBitmap(BitmapFactory.decodeResource(ptb0Var.b6(), R.drawable.bg_poll_bg_thumb));
            imageView.getDrawable().setColorFilter(-3682860, PorterDuff.Mode.SRC_IN);
            return ptb0Var;
        }
        if (i == 0) {
            qtb0 qtb0Var = new qtb0(viewGroup, new a(this, ymb0.class, "selectionItem", "getSelectionItem()Ljava/lang/Object;", 0));
            qtb0Var.t6(-1446414);
            return qtb0Var;
        }
        if (i == 1) {
            fqb0 fqb0Var = new fqb0(viewGroup, new b(this, ymb0.class, "selectionItem", "getSelectionItem()Ljava/lang/Object;", 0));
            fqb0Var.t6(e43.a.getColor(R.color.vk_white_alpha20));
            return fqb0Var;
        }
        if (i != 2) {
            return new rrb0(viewGroup, fa6Var);
        }
        hqb0 hqb0Var = new hqb0(viewGroup, new c(this, ymb0.class, "selectionItem", "getSelectionItem()Ljava/lang/Object;", 0));
        ((t8m0) hqb0Var.r.getBackground()).c(e43.a.getColor(R.color.vk_gray_800));
        hqb0Var.t6(e43.a.getColor(R.color.vk_white_alpha20));
        bwt0.p0(hqb0Var.s, true);
        return hqb0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e9, code lost:
    
        if ((r10 != null ? r10.equals("java.io.IOException: Canceled") : false) != false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    @Override // xsna.jnb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(bwg0 bwg0Var, npb0 npb0Var) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3 = bwg0Var instanceof y3e0;
        ArrayList arrayList = this.i;
        Object obj2 = null;
        if (z3) {
            y3e0 y3e0Var = (y3e0) bwg0Var;
            int i = y3e0Var.a;
            int b2 = y3e0Var.b();
            int c2 = y3e0Var.c();
            Iterator it = j5g.W0(arrayList).iterator();
            while (true) {
                ztw ztwVar = (ztw) it;
                if (!ztwVar.b.hasNext()) {
                    break;
                }
                Object next = ztwVar.next();
                Integer num = ((inb0) ((xtw) next).b).a;
                if (num != null && num.intValue() == i) {
                    obj2 = next;
                    break;
                }
            }
            xtw xtwVar = (xtw) obj2;
            if (xtwVar != null) {
                Parcelable a2 = y3e0Var.a();
                if (a2 != null ? a2 instanceof PhotoPoll : true) {
                    inb0 inb0Var = (inb0) xtwVar.b;
                    inb0Var.c = b2;
                    inb0Var.d = c2;
                    PhotoPoll photoPoll = (PhotoPoll) a2;
                    inb0Var.b = photoPoll;
                    if (photoPoll != null) {
                        photoPoll.f = inb0Var.e;
                    }
                    if (photoPoll != null) {
                        photoPoll.g = inb0Var.f;
                    }
                    notifyItemChanged(O0(xtwVar.a));
                    if (a2 != null) {
                        npb0Var.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (bwg0Var instanceof abq0) {
            abq0 abq0Var = (abq0) bwg0Var;
            int i2 = abq0Var.a;
            Iterator it2 = j5g.W0(arrayList).iterator();
            while (true) {
                ztw ztwVar2 = (ztw) it2;
                if (!ztwVar2.b.hasNext()) {
                    obj = null;
                    break;
                }
                obj = ztwVar2.next();
                Integer num2 = ((inb0) ((xtw) obj).b).a;
                if (num2 != null && num2.intValue() == i2) {
                    break;
                }
            }
            xtw xtwVar2 = (xtw) obj;
            if (xtwVar2 != null) {
                int i3 = xtwVar2.a;
                int i4 = abq0Var.b;
                String str = abq0Var.c;
                if (i4 == 129) {
                    if (str != null ? drm0.D(str, "Invalid photo: image size shold be at least", false) : false) {
                        z = true;
                        if (i4 == 129) {
                            if (str != null ? drm0.D(str, "Invalid photo: file from \"file\" exceeded", false) : false) {
                                z2 = true;
                                if (i4 == -1) {
                                }
                                r2 = false;
                                if (!r2) {
                                    cvk.u(z ? R.string.error_upload_small_image : z2 ? R.string.error_upload_big_image : R.string.error, false);
                                }
                                arrayList.remove(i3);
                                N0(null);
                                notifyItemRemoved(O0(i3));
                                npb0Var.invoke();
                            }
                        }
                        z2 = false;
                        if (i4 == -1) {
                        }
                        r2 = false;
                        if (!r2) {
                        }
                        arrayList.remove(i3);
                        N0(null);
                        notifyItemRemoved(O0(i3));
                        npb0Var.invoke();
                    }
                }
                z = false;
                if (i4 == 129) {
                }
                z2 = false;
                if (i4 == -1) {
                }
                r2 = false;
                if (!r2) {
                }
                arrayList.remove(i3);
                N0(null);
                notifyItemRemoved(O0(i3));
                npb0Var.invoke();
            }
        }
    }

    @Override // xsna.jnb0
    public final boolean v0() {
        return !this.i.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if ((e0Var instanceof wif0) && !list.isEmpty()) {
            wif0 wif0Var = (wif0) e0Var;
            for (Object obj : list) {
                if (obj instanceof Boolean) {
                    wif0Var.q6(((Boolean) obj).booleanValue());
                }
            }
            return;
        }
        super.onBindViewHolder(e0Var, i, list);
    }
}
