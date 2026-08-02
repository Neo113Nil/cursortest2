package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vkontakte.android.R;

/* compiled from: GameScreenshotAdapter.kt */
/* loaded from: classes6.dex */
public final class z7t extends zoj0<WebPhoto, a> {
    public final int e;
    public final int f;

    /* compiled from: GameScreenshotAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final View l;
        public final VKImageController<View> m;

        public a(View view) {
            super(view);
            this.l = view;
            VKReplacerView vKReplacerView = (VKReplacerView) this.itemView.findViewById(R.id.vk_apps_install_game_image_screen);
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(vKReplacerView.getContext());
            vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
            this.m = create;
        }
    }

    public z7t(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        WebPhoto webPhoto = (WebPhoto) this.c.c(i);
        z7t z7tVar = z7t.this;
        String str = webPhoto.a(iah0.a(z7tVar.f)).b;
        if (!drm0.N(str)) {
            aVar.m.f(str, new VKImageController.b(8.0f, null, false, 0, null, null, null, null, iah0.b(0.5f), krv0.l(R.attr.vk_ui_image_border_alpha), null, null, null, 63994));
        }
        aVar.l.setOnClickListener(new y7t(z7tVar, i, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, R.layout.vk_apps_app_install_screenshot_holder, viewGroup, false);
        b.setLayoutParams(new ViewGroup.LayoutParams(this.f, this.e));
        return new a(b);
    }
}
