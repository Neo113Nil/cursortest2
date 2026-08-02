package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: MusicSnippetsContentView.kt */
/* loaded from: classes3.dex */
public final class j650 implements gm50 {
    public static final int k = cn70.b(8);
    public final f5z b;
    public final bgy c;
    public final View d;
    public final RecyclerView e;
    public final View f;
    public final e650 g;
    public final i650 h;
    public final mck0 i;
    public boolean j;

    public j650(f5z f5zVar, Context context, bgy bgyVar, jck0 jck0Var) {
        this.b = f5zVar;
        this.c = bgyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_snippets_fragment, (ViewGroup) null);
        this.d = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.music_snippet_packs_recycler);
        this.e = recyclerView;
        this.f = inflate.findViewById(R.id.music_snippet_error_view);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        e650 e650Var = new e650(new ug8(1, this, j650.class, "moveToNextSection", "moveToNextSection(I)V", 0, 9), bgyVar, jck0Var);
        this.g = e650Var;
        this.h = new i650();
        inflate.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        cdk0 cdk0Var = new cdk0();
        cdk0Var.attachToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(e650Var);
        recyclerView.setItemAnimator(null);
        int a = e3m.a(R.dimen.music_snippet_pack_recycler_height, inflate.getContext());
        int i = k;
        recyclerView.addItemDecoration(new v98(i, i, a, false));
        mck0 mck0Var = new mck0(cdk0Var, new h650(this));
        recyclerView.addOnScrollListener(mck0Var);
        this.i = mck0Var;
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            f4m.j(toolbar);
            return;
        }
        toolbar.setTitle(toolbar.getContext().getString(R.string.music_snippets_screen_title));
        toolbar.setNavigationIcon(e3m.e(R.attr.im_ic_back_toolbar, toolbar.getContext()));
        toolbar.setNavigationContentDescription(toolbar.getContext().getString(R.string.music_talkback_go_back));
        toolbar.setNavigationOnClickListener(new oyt(this, 3));
        toolbar.setOnClickListener(new kn9(this, 8));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
