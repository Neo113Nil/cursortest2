package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ji8;

/* compiled from: BroadcastScheduledView.kt */
/* loaded from: classes7.dex */
public final class hi8 {

    @SuppressLint({"InflateParams"})
    public final ViewGroup a;
    public final View b;
    public final jd8 c;
    public final io.reactivex.rxjava3.subjects.f<ii8> d;
    public List<ji8.a> e;
    public boolean f;
    public String g;
    public boolean h;

    public hi8(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_broadcast_scheduled, viewGroup, false);
        this.a = viewGroup2;
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        View findViewById = viewGroup2.findViewById(R.id.close);
        this.b = findViewById;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.l = true;
        jd8 jd8Var = new jd8(LayoutInflater.from(context), new r6(this, 12));
        this.c = jd8Var;
        this.d = new io.reactivex.rxjava3.subjects.f<>();
        this.e = EmptyList.b;
        this.h = true;
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            sjo.b(navigationIcon, -1, PorterDuff.Mode.SRC_IN);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(jd8Var);
        recyclerView.setItemAnimator(null);
        toolbar.setNavigationOnClickListener(new gi8(this, 0));
        jjc.g(findViewById, new t6(this, 12));
    }

    public final void a() {
        if (!this.h) {
            throw new IllegalStateException("Instance is destroyed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<xsna.ji8$a>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    public final void b() {
        ?? r1;
        boolean z = this.f;
        if (z) {
            List<ji8.a> list = this.e;
            r1 = new ArrayList(list.size());
            for (ji8.a aVar : list) {
                r1.add(new ji8.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, epx.f(aVar.a, this.g)));
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            r1 = this.e;
        }
        this.c.submitList(r1);
    }
}
