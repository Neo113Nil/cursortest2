package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.rg8;

/* compiled from: BroadcastInfoView.kt */
/* loaded from: classes7.dex */
public final class pg8 {

    @SuppressLint({"InflateParams"})
    public final ViewGroup a;
    public final View b;
    public final ViewGroup c;
    public final TextView d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final View g;
    public final RecyclerView h;
    public final kfz i;
    public final ofz j;
    public final bzb0 k;
    public final io.reactivex.rxjava3.subjects.f<qg8> l;
    public boolean m;
    public boolean n;

    /* compiled from: BroadcastInfoView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<qg8, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(qg8 qg8Var) {
            qg8 qg8Var2 = qg8Var;
            pg8 pg8Var = (pg8) this.receiver;
            if (pg8Var.m) {
                pg8Var.l.onNext(qg8Var2);
            }
            return s3q0.a;
        }
    }

    public pg8(Context context, CharSequence charSequence, CharSequence charSequence2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_broadcast_info, (ViewGroup) null, false);
        this.a = viewGroup;
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        View findViewById = viewGroup.findViewById(R.id.progress);
        this.b = findViewById;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.error);
        this.c = viewGroup2;
        this.d = (TextView) viewGroup.findViewById(R.id.error_text);
        Button button = (Button) viewGroup.findViewById(R.id.error_retry);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.content);
        this.e = viewGroup3;
        this.f = (ViewGroup) viewGroup.findViewById(R.id.content_finish);
        View findViewById2 = viewGroup.findViewById(R.id.content_finish_button);
        this.g = findViewById2;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.content_list);
        this.h = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.l = true;
        kfz kfzVar = new kfz(LayoutInflater.from(context), new a(1, this, pg8.class, "publishEvent", "publishEvent(Lcom/vk/voip/ui/broadcast/views/info/BroadcastInfoViewEvent;)V", 0));
        this.i = kfzVar;
        this.j = new ofz(context, charSequence2);
        this.k = new bzb0(context);
        this.l = new io.reactivex.rxjava3.subjects.f<>();
        this.m = true;
        this.n = true;
        viewGroup.setOnClickListener(new o44(0));
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            sjo.b(navigationIcon, -1, PorterDuff.Mode.SRC_IN);
        }
        toolbar.setTitle(charSequence == null ? context.getString(R.string.voip_broadcast) : charSequence);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(kfzVar);
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
        gVar.g = false;
        recyclerView.setItemAnimator(gVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setRecycledViewPool(new rru());
        float f = 16;
        recyclerView.addItemDecoration(new ujq(iah0.a(f), iah0.a(f), 5));
        recyclerView.addItemDecoration(new mfz(context));
        bwt0.i0(button, new com.vk.voip.ui.menu.feature.a(this, 10));
        toolbar.setNavigationOnClickListener(new og8(this, 0));
        bwt0.i0(findViewById2, new yx0(this, 12));
        rg8.c cVar = rg8.c.a;
        bwt0.p0(findViewById, true);
        bwt0.p0(viewGroup2, false);
        bwt0.p0(viewGroup3, false);
        kfzVar.submitList(EmptyList.b);
    }

    public final void a() {
        if (!this.m) {
            throw new IllegalStateException("Instance is destroyed");
        }
    }
}
