package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.zh4;

/* compiled from: AudioBookPersonListAdapter.kt */
/* loaded from: classes3.dex */
public final class mi4 extends RecyclerView.Adapter<a> {
    public final zh4.c c;
    public final ArrayList d = new ArrayList();

    /* compiled from: AudioBookPersonListAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final View l;
        public final izs<uh4, s3q0> m;
        public final AppCompatTextView n;

        public a(View view, zh4.c cVar) {
            super(view);
            this.l = view;
            this.m = cVar;
            this.n = (AppCompatTextView) view.findViewById(R.id.tv_title);
        }
    }

    public mi4(zh4.c cVar) {
        this.c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        AudioBookPersonModel audioBookPersonModel = (AudioBookPersonModel) this.d.get(i);
        int i2 = audioBookPersonModel.b;
        String str = audioBookPersonModel.c;
        aVar2.itemView.setOnClickListener(new li4(aVar2, i2, 0));
        aVar2.itemView.setContentDescription(str);
        aVar2.n.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(tf3.b(viewGroup, R.layout.audiobook_person_action_item, viewGroup, false), this.c);
    }
}
