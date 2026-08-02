package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.CircularProgressView;
import com.vkontakte.android.R;

/* compiled from: PopupSettingsView.kt */
/* loaded from: classes6.dex */
public final class sxb0 implements gm50 {
    public final f5z b;
    public final kn20 c;
    public final View d;
    public final RecyclerView e;
    public final CircularProgressView f;
    public final lxb0 g;

    public sxb0(Context context, f5z f5zVar, kn20 kn20Var) {
        this.b = f5zVar;
        this.c = kn20Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_settings_fragment, (ViewGroup) null);
        this.d = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.back_button);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.content_recycler);
        this.e = recyclerView;
        this.f = (CircularProgressView) inflate.findViewById(R.id.circular_progress);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.sticker_popup_settings_title);
        lxb0 lxb0Var = new lxb0(new dd4(this, 8));
        this.g = lxb0Var;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(lxb0Var);
        jjc.g(imageView, new mga0(this, 3));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
