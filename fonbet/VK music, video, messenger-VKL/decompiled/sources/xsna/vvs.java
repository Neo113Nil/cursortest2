package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.fdf0;
import xsna.gwf;
import xsna.oqx0;

/* compiled from: FullScreenGamesConfirmExitDialog.kt */
/* loaded from: classes6.dex */
public final class vvs extends androidx.fragment.app.d {
    public static final int C = iah0.a(16);
    public static final int D = iah0.a(12);
    public View A;
    public FrameLayout B;
    public final bpn0 x = new bpn0(new n5i(this, 17));
    public final bpn0 y = new bpn0(new jcg(this, 20));
    public VkText z;

    /* compiled from: FullScreenGamesConfirmExitDialog.kt */
    public static final class a implements gwf.a {
        public a() {
        }

        @Override // xsna.gwf.a
        public final void K2() {
            FrameLayout frameLayout = vvs.this.B;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // xsna.gwf.a
        public final void a(View view, wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
            awt0.s(view, new i4(6, wzsVar, view));
            vvs vvsVar = vvs.this;
            FrameLayout frameLayout = vvsVar.B;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = vvsVar.B;
            if (frameLayout2 != null) {
                frameLayout2.addView(view);
            }
            View view2 = vvsVar.A;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* compiled from: FullScreenGamesConfirmExitDialog.kt */
    public static final class b implements fdf0.a {
        public b() {
        }

        @Override // xsna.fdf0.a
        public final void a(WebApiApplication webApiApplication) {
            Context mo2getContext = vvs.this.mo2getContext();
            if (mo2getContext != null) {
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge;
                String str = webApiApplication.D;
                if (str == null) {
                    str = "";
                }
                SuperappUiRouterBridge.b.b(superappUiRouterBridge2, mo2getContext, webApiApplication, new nex0(str, "https://" + a0a.d + "/app" + webApiApplication.b), "games_confirm_exit_dialog", webApiApplication.w, null, null, 96);
            }
            vvs vvsVar = vvs.this;
            DialogResultState dialogResultState = DialogResultState.GAME_CLICKED;
            int i = vvs.C;
            vvsVar.Dn(dialogResultState);
        }
    }

    public final void Dn(DialogResultState dialogResultState) {
        Bundle bundle = new Bundle();
        bundle.putString("DIALOG_RESULT_STATE_KEY", dialogResultState.name());
        s3q0 s3q0Var = s3q0.a;
        getParentFragmentManager().k0(bundle, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
        un(false, false);
    }

    public final int En() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("DIALOG_TYPE_KEY", 1);
        }
        return 1;
    }

    public final WebAdConfig Fn() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = arguments.getParcelable("WEB_AD_CONFIG_KEY", WebAdConfig.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = arguments.getParcelable("WEB_AD_CONFIG_KEY");
            parcelable = (WebAdConfig) (parcelable3 instanceof WebAdConfig ? parcelable3 : null);
        }
        return (WebAdConfig) parcelable;
    }

    public final boolean Gn(Integer num) {
        Context mo2getContext;
        Resources resources;
        Configuration configuration;
        return (num != null && num.intValue() == 1) || !(num == null || num.intValue() != 0 || (mo2getContext = mo2getContext()) == null || (resources = mo2getContext.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dn(DialogResultState.OUTSIDE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_apps_dialog_on_exit, viewGroup, false);
        VkText vkText = (VkText) inflate.findViewById(R.id.blockName);
        RecyclerView recyclerView = null;
        if (vkText != null) {
            vkText.setVisibility(4);
        } else {
            vkText = null;
        }
        this.z = vkText;
        View findViewById = inflate.findViewById(R.id.shadowView);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        } else {
            findViewById = null;
        }
        this.A = findViewById;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.bottomContentContainer);
        if (frameLayout != null) {
            Bundle arguments = getArguments();
            frameLayout.setVisibility((!Gn(arguments != null ? bo8.d(arguments, "APP_ORIENTATION_KEY") : null) ? En() == 3 : En() != 1) ? 8 : 0);
        } else {
            frameLayout = null;
        }
        this.B = frameLayout;
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.imagesRecyclerView);
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(En() == 2 ? 0 : 8);
            recyclerView = recyclerView2;
        }
        if (En() == 2) {
            if (recyclerView != null) {
                mo2getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((fdf0) this.x.getValue());
            }
            if (recyclerView != null) {
                recyclerView.addItemDecoration(new z0x(D, C));
            }
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(new rkf0(new p4f(this, 27)));
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B = null;
        bpn0 bpn0Var = this.y;
        if (bpn0Var.isInitialized()) {
            ((gwf) bpn0Var.getValue()).destroy();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Bundle a2 = q9k.a("DIALOG_RESULT_STATE_KEY", "SHOWN");
        s3q0 s3q0Var = s3q0.a;
        getParentFragmentManager().k0(a2, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -1);
        ppx0.b(window, false);
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        fVar.b(519);
        fVar.h(1);
        fVar.g(2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        WebAdConfig Fn;
        Resources resources;
        Configuration configuration;
        super.onViewCreated(view, bundle);
        int i = 2;
        if (En() == 2) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("RECOMMENDED_GAMES_KEY", WebApiApplication.class) : arguments.getParcelableArrayList("RECOMMENDED_GAMES_KEY");
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    Context mo2getContext = mo2getContext();
                    boolean z = (mo2getContext == null || (resources = mo2getContext.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) ? false : true;
                    VkText vkText = this.z;
                    if (z) {
                        if (vkText != null) {
                            vkText.setVisibility(0);
                        }
                    } else if (vkText != null) {
                        vkText.setVisibility(4);
                    }
                    List H0 = !z ? j5g.H0(parcelableArrayList, 4) : parcelableArrayList;
                    fdf0 fdf0Var = (fdf0) this.x.getValue();
                    fdf0Var.i = z;
                    fdf0Var.setItems(H0);
                    View view2 = this.A;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        String str = ((WebApiApplication) it.next()).w;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArray("DIALOG_RESULT_SHOWN_RECOMMENDED_GAMES", strArr);
                    s3q0 s3q0Var = s3q0.a;
                    getParentFragmentManager().k0(bundle2, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
                }
            }
        } else if (En() == 3 && (Fn = Fn()) != null && Fn.g) {
            gwf gwfVar = (gwf) this.y.getValue();
            Context mo2getContext2 = mo2getContext();
            Bundle arguments2 = getArguments();
            gwfVar.a(mo2getContext2, arguments2 != null ? Long.valueOf(arguments2.getLong("APP_ID_KEY")) : null, Fn());
        }
        ((ConstraintLayout) view.findViewById(R.id.mainContainer)).setOnClickListener(new hn2(this, 6));
        view.findViewById(R.id.positiveButton).setOnClickListener(new v3o(this, i));
        view.findViewById(R.id.negativeButton).setOnClickListener(new mn9(this, 4));
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.message);
        Context mo2getContext3 = mo2getContext();
        textView.setText(mo2getContext3 != null ? mo2getContext3.getString(R.string.vk_apps_games_alert_title) : null);
        Context mo2getContext4 = mo2getContext();
        textView2.setText(mo2getContext4 != null ? mo2getContext4.getString(R.string.vk_apps_games_alert_message) : null);
    }
}
