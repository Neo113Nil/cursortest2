package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.zh4;

/* compiled from: AudioBookPersonListRenderExtension.kt */
/* loaded from: classes3.dex */
public final class ni4 implements qi4 {
    public final zh4 b;
    public final zh4.c c;
    public final View d;
    public final RecyclerView e;

    public ni4(Context context, zh4 zh4Var, zh4.c cVar) {
        this.b = zh4Var;
        this.c = cVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_persons, (ViewGroup) null, false);
        this.d = inflate;
        this.e = (RecyclerView) inflate.findViewById(R.id.rv_simple_list);
        inflate.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, context));
    }

    @Override // xsna.qi4
    public final void Uc(ri4 ri4Var) {
        List<AudioBookPersonModel> list = ri4Var.b;
        if (list == null) {
            return;
        }
        RecyclerView recyclerView = this.e;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        mi4 mi4Var = new mi4(this.c);
        ArrayList arrayList = mi4Var.d;
        arrayList.clear();
        arrayList.addAll(list);
        mi4Var.notifyDataSetChanged();
        recyclerView.setAdapter(mi4Var);
    }

    @Override // xsna.qi4
    public final View getView() {
        return this.d;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
