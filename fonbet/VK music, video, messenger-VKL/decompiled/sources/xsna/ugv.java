package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.wgv;

/* compiled from: HslAdapter.kt */
/* loaded from: classes18.dex */
public final class ugv extends zoj0<wgv, RecyclerView.e0> {
    public final rmg e;

    public ugv(rmg rmgVar) {
        this.e = rmgVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String string;
        if (e0Var instanceof tgv) {
            tgv tgvVar = (tgv) e0Var;
            wgv wgvVar = (wgv) this.c.c(i);
            d9g d9gVar = tgvVar.n;
            Context context = tgvVar.l;
            switch (wgv.a.$EnumSwitchMapping$0[wgvVar.a.ordinal()]) {
                case 1:
                    string = context.getString(R.string.correction_color_red_description);
                    break;
                case 2:
                    string = context.getString(R.string.correction_color_orange_description);
                    break;
                case 3:
                    string = context.getString(R.string.correction_color_yellow_description);
                    break;
                case 4:
                    string = context.getString(R.string.correction_color_green_description);
                    break;
                case 5:
                    string = context.getString(R.string.correction_color_cyan_description);
                    break;
                case 6:
                    string = context.getString(R.string.correction_color_blue_description);
                    break;
                case 7:
                    string = context.getString(R.string.correction_color_purple_description);
                    break;
                case 8:
                    string = context.getString(R.string.correction_color_magenta_description);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            d9gVar.setContentDescription(string);
            d9gVar.setColor(context.getColor(wgvVar.b));
            jjc.g(d9gVar, new uoh(tgvVar, 25));
            d9gVar.setSelected(wgvVar.f);
            d9gVar.setModified((wgvVar.c == 0.5f && wgvVar.d == 0.5f && wgvVar.e == 0.5f) ? false : true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new tgv(viewGroup.getContext(), new sec(1, this, ugv.class, "onItemSelected", "onItemSelected(I)V", 0, 2));
    }
}
