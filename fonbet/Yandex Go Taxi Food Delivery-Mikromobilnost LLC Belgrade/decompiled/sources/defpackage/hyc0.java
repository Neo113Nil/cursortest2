package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes10.dex */
public final class hyc0 extends RecyclerView.Adapter {
    public final String[] a;
    public final String[] b;
    public final Drawable[] c;
    public final /* synthetic */ PlayerControlView w;

    public hyc0(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.w = playerControlView;
        this.a = strArr;
        this.b = new String[strArr.length];
        this.c = drawableArr;
    }

    public final boolean f() {
        return h(1) || h(0);
    }

    public final void g(String str) {
        this.b[0] = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final boolean h(int i) {
        PlayerControlView playerControlView = this.w;
        if (playerControlView.player == null) {
            return false;
        }
        return i != 0 ? i != 1 || (playerControlView.player.isCommandAvailable(30) && playerControlView.player.isCommandAvailable(29)) : playerControlView.player.isCommandAvailable(13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        gyc0 gyc0Var = (gyc0) x0Var;
        if (h(i)) {
            gyc0Var.a.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        } else {
            gyc0Var.a.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        }
        gyc0Var.N.setText(this.a[i]);
        String str = this.b[i];
        TextView textView = gyc0Var.O;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.c[i];
        ImageView imageView = gyc0Var.P;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        PlayerControlView playerControlView = this.w;
        return new gyc0(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(cuh0.exo_styled_settings_list_item, viewGroup, false));
    }
}
