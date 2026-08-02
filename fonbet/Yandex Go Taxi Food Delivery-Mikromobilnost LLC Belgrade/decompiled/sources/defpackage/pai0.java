package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.domain.reactions.ReactionCodes;
import com.yandex.messaging.internal.entities.FullReactionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class pai0 extends RecyclerView.Adapter {
    public final xav a;
    public final gsu b;
    public final zxo c;
    public wls w;
    public vyf0 x;
    public boolean y;
    public final ArrayList z = new ArrayList();

    public pai0(xav xavVar, gsu gsuVar, zxo zxoVar) {
        this.a = xavVar;
        this.b = gsuVar;
        this.c = zxoVar;
    }

    public final void f(List list, boolean z) {
        ArrayList arrayList = this.z;
        List J0 = a.J0(arrayList);
        boolean z2 = this.y;
        boolean z3 = false;
        zxo zxoVar = this.c;
        boolean z4 = z2 && zxoVar.c;
        if (z && zxoVar.c) {
            z3 = true;
        }
        this.y = z;
        arrayList.clear();
        arrayList.addAll(list);
        kp50.f(new oai0(J0, list, z4, z3), true).b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.z.size() + ((this.y && this.c.c) ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.c.c && this.y && this.z.size() == i) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        Object obj;
        if (x0Var instanceof uai0) {
            uai0 uai0Var = (uai0) x0Var;
            FullReactionInfo fullReactionInfo = (FullReactionInfo) this.z.get(i);
            View view = uai0Var.a;
            ImageView imageView = uai0Var.R;
            TextView textView = uai0Var.S;
            Context context = textView.getContext();
            if (fullReactionInfo.isChecked()) {
                int c = drb1.c(jng0.messagingChatMyReactionCounterBgColor, context);
                Drawable background = textView.getBackground();
                if (background != null) {
                    background.setColorFilter(new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_ATOP));
                }
                textView.setTextColor(drb1.c(jng0.messagingChatMyReactionCounterFgColor, context));
            } else {
                int c2 = drb1.c(jng0.messagingChatOtherReactionCounterBgColor, context);
                Drawable background2 = textView.getBackground();
                if (background2 != null) {
                    background2.setColorFilter(new PorterDuffColorFilter(c2, PorterDuff.Mode.SRC_ATOP));
                }
                textView.setTextColor(drb1.c(jng0.messagingChatOtherReactionCounterFgColor, context));
            }
            int i2 = 0;
            if (fullReactionInfo.getCount() > 0) {
                textView.setText(hta1.a(fullReactionInfo.getCount()));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(4);
            }
            if (!jl40.l(imageView.getTag(), Integer.valueOf(fullReactionInfo.getType()))) {
                String str = uai0Var.O + fullReactionInfo.getType();
                g9v load = uai0Var.N.load(str);
                int i3 = uai0Var.P;
                yn50 yn50Var = (yn50) load;
                xn50 xn50Var = yn50Var.b;
                xn50Var.i = i3;
                xn50Var.j = i3;
                yn50Var.b(imageView, new myf0(str, 1));
                imageView.setTag(Integer.valueOf(fullReactionInfo.getType()));
            }
            int type = fullReactionInfo.getType();
            ReactionCodes.Companion.getClass();
            Iterator<E> it = ReactionCodes.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ReactionCodes) obj).getCode() == type) {
                        break;
                    }
                }
            }
            ReactionCodes reactionCodes = (ReactionCodes) obj;
            String string = context.getString(reactionCodes != null ? reactionCodes.getContentDescRes() : oyh0.reaction_unknown_content_desc);
            if (fullReactionInfo.getCount() > 0) {
                string = fullReactionInfo.isChecked() ? context.getResources().getQuantityString(ewh0.reaction_selected_with_count_content_desc, fullReactionInfo.getCount(), string, Integer.valueOf(fullReactionInfo.getCount())) : context.getResources().getQuantityString(ewh0.reaction_with_count_content_desc, fullReactionInfo.getCount(), string, Integer.valueOf(fullReactionInfo.getCount()));
            } else if (fullReactionInfo.isChecked()) {
                string = context.getString(oyh0.reaction_selected_content_desc, string);
            }
            view.setContentDescription(string);
            imageView.setContentDescription(string);
            textView.setContentDescription(null);
            view.setOnClickListener(new tai0(i2, uai0Var, fullReactionInfo));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View f = oo31.f(viewGroup, this.c.c ? olh0.msg_vh_reaction_chooser_grid : olh0.msg_vh_reaction_chooser, viewGroup, false);
        if (i != 1) {
            gsu gsuVar = this.b;
            String str = (String) gsuVar.a.c(gsuVar.d);
            int a = e8m.a(40);
            wls wlsVar = this.w;
            return new uai0(f, this.a, str, a, wlsVar != null ? wlsVar : null);
        }
        vyf0 vyf0Var = this.x;
        vyf0 vyf0Var2 = vyf0Var != null ? vyf0Var : null;
        utn utnVar = new utn(f);
        f.findViewById(e9h0.reaction_count).setVisibility(8);
        ImageView imageView = (ImageView) f.findViewById(e9h0.reaction_image);
        int a2 = e8m.a(40);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(a2, a2));
        Context context = f.getContext();
        int i2 = kng0.messagingIsLightTheme;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        imageView.setBackgroundResource(!(typedValue.data != 0) ? wwg0.ic_extend_reactions_night : wwg0.ic_extend_reactions);
        imageView.setOnClickListener(new xbg0(4, vyf0Var2));
        return utnVar;
    }
}
