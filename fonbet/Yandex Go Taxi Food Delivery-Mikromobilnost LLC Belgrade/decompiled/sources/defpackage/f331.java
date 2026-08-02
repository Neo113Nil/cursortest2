package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.vault.di.a;
import com.yandex.go.vault.di.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class f331 extends mao {
    public final kzo a;
    public q2w b;
    public nzm c;

    public f331(kzo kzoVar) {
        this.a = kzoVar;
    }

    public final nzm a() {
        nzm nzmVar = this.c;
        if (nzmVar != null) {
            return nzmVar;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        final GoFrameLayout goFrameLayout;
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(llh0.layout_vault_error, viewGroup, false);
        viewGroup.addView(inflate);
        int i2 = b9h0.refresh_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
        if (buttonComponent == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        this.c = new nzm(buttonComponent, 5, (GoFrameLayout) inflate);
        ButtonComponent buttonComponent2 = (ButtonComponent) a().c;
        kzo kzoVar = this.a;
        buttonComponent2.setDebounceClickListener(new bh11(16, (a) kzoVar.c));
        ((sls) kzoVar.x).invoke();
        b bVar = (b) kzoVar.w;
        GoFrameLayout goFrameLayout2 = (GoFrameLayout) a().b;
        GoImageView goImageView = new GoImageView(goFrameLayout2.getContext(), null, 0, 6, null);
        goImageView.setImageResource(dzg0.ic_cross_filled);
        c.z(bVar, goImageView);
        goImageView.setImageTintList(ColorStateList.valueOf(-1));
        goFrameLayout2.addView(goImageView);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) goImageView.getLayoutParams();
        layoutParams.gravity = 53;
        layoutParams.width = tje.u(24, goFrameLayout2.getContext());
        layoutParams.height = tje.u(24, goFrameLayout2.getContext());
        layoutParams.topMargin = tje.u(20, goFrameLayout2.getContext());
        layoutParams.rightMargin = tje.u(16, goFrameLayout2.getContext());
        nzm a = a();
        GoFrameLayout goFrameLayout3 = (GoFrameLayout) a.b;
        this.b = tje.i(goFrameLayout3, 80, new e331(i, a, goFrameLayout3.getContext()));
        if (kzoVar.b) {
            tje.i((GoFrameLayout) a().b, 48, new wx11(16, this));
        }
        tje.k(80, (GoFrameLayout) a().b);
        nzm nzmVar = this.c;
        if (nzmVar != null && (goFrameLayout = (GoFrameLayout) nzmVar.b) != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (goFrameLayout.isAttachedToWindow()) {
                goFrameLayout.requestApplyInsets();
            } else {
                goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.vault.ui.VaultErrorViewController$applyInsets$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        goFrameLayout.removeOnAttachStateChangeListener(this);
                        view.requestApplyInsets();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            }
        }
        GoFrameLayout goFrameLayout4 = (GoFrameLayout) a().b;
        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
        np31.c(goFrameLayout4);
        return goFrameLayout4;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        q2w q2wVar = this.b;
        if (q2wVar != null) {
            q2wVar.cancel();
        }
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
