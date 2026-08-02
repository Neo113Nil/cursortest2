package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: EmojiVariantsPickerAdapter.kt */
/* loaded from: classes18.dex */
public final class jep extends RecyclerView.Adapter<kdp> {
    public final Context c;
    public final o9f0 d;
    public final sdp e;
    public final ArrayList<String> f = new ArrayList<>();
    public int g;

    public jep(Context context, o9f0 o9f0Var, sdp sdpVar) {
        this.c = context;
        this.d = o9f0Var;
        this.e = sdpVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(kdp kdpVar, int i) {
        String str = this.f.get(i);
        vdp vdpVar = (vdp) kdpVar;
        vdpVar.o = str;
        rdp rdpVar = vdpVar.n;
        rdpVar.a(str, false);
        rdpVar.setContentDescription(str);
        vdpVar.m = this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final kdp onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new vdp(this.c, this.d, this.e);
    }
}
