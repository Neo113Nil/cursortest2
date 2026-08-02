package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.zh4;

/* compiled from: AudioBookPersonActionItemsRenderExtension.kt */
/* loaded from: classes3.dex */
public final class yh4 implements qi4 {
    public final zh4 b;
    public final View c;
    public final RecyclerView d;
    public final xh4 e;

    public yh4(Context context, zh4.d dVar, zh4 zh4Var) {
        this.b = zh4Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_person_audiobook, (ViewGroup) null, false);
        this.c = inflate;
        this.d = (RecyclerView) inflate.findViewById(R.id.rv_action_list);
        this.e = new xh4(dVar);
        inflate.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, context));
    }

    @Override // xsna.qi4
    public final void Uc(ri4 ri4Var) {
        List<vh4> list = ri4Var.c;
        if (list == null) {
            return;
        }
        this.c.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView = this.d;
        recyclerView.setLayoutManager(linearLayoutManager);
        xh4 xh4Var = this.e;
        recyclerView.setAdapter(xh4Var);
        p4g.n(xh4Var.d, list);
        xh4Var.notifyDataSetChanged();
    }

    @Override // xsna.qi4
    public final View getView() {
        return this.c;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
