package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.superapp.api.dto.app.WebLeaderboardData;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: VkLeaderboardFragment.kt */
/* loaded from: classes6.dex */
public final class b2v0 extends com.google.android.material.bottomsheet.c {
    public i6m0 A;
    public final b B = new b();
    public WebLeaderboardData y;
    public kld0 z;

    /* compiled from: VkLeaderboardFragment.kt */
    public static final class a {
        public static b2v0 a(WebLeaderboardData webLeaderboardData) {
            b2v0 b2v0Var = new b2v0();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("leaderboardData", webLeaderboardData);
            b2v0Var.setArguments(bundle);
            return b2v0Var;
        }
    }

    @Override // xsna.c33, androidx.fragment.app.d
    public final void Cn(Dialog dialog, int i) {
        super.Cn(dialog, i);
        Context a2 = hnj.a(dialog.getContext());
        RecyclerView recyclerView = new RecyclerView(a2);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        WebLeaderboardData webLeaderboardData = this.y;
        if (webLeaderboardData == null) {
            webLeaderboardData = null;
        }
        recyclerView.setAdapter(new a2v0(webLeaderboardData, new v5n0(this, 21)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, iah0.a(48));
        dialog.setContentView(recyclerView, layoutParams);
        View view = (View) recyclerView.getParent();
        view.setBackgroundColor(0);
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view.getLayoutParams()).a;
        if (cVar instanceof BottomSheetBehavior) {
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar;
            ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehavior.Z;
            arrayList.clear();
            b bVar = this.B;
            if (bVar != null) {
                arrayList.add(bVar);
            }
            bottomSheetBehavior.W((int) ((a2.getResources().getDisplayMetrics().heightPixels * 70.0f) / 100.0f), false);
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.getParent();
        View inflate = LayoutInflater.from(a2).inflate(R.layout.vk_html5_game_leaderboard_button, (ViewGroup) coordinatorLayout, false);
        inflate.setElevation(200.0f);
        inflate.setOnClickListener(new bd0(this, 18));
        TextView textView = (TextView) inflate.findViewById(R.id.leaderboard_button);
        WebLeaderboardData webLeaderboardData2 = this.y;
        textView.setText((webLeaderboardData2 != null ? webLeaderboardData2 : null).c.get(0).f ? getString(R.string.vk_htmlgame_leaderboard_play_again) : getString(R.string.vk_htmlgame_leaderboard_continue_playing));
        coordinatorLayout.addView(inflate);
    }

    public final void Fn(kld0 kld0Var) {
        this.z = kld0Var;
    }

    public final void Gn(i6m0 i6m0Var) {
        this.A = i6m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.y = arguments != null ? (WebLeaderboardData) arguments.getParcelable("leaderboardData") : null;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        kld0 kld0Var = this.z;
        if (kld0Var != null) {
            kld0Var.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            this.s.getWindow().getDecorView().setSystemUiVisibility(3332);
            Display defaultDisplay = ((WindowManager) kn().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            float f = 480;
            this.s.getWindow().setLayout(displayMetrics.widthPixels < iah0.a(f) ? displayMetrics.widthPixels : iah0.a(f), -1);
        } catch (Exception unused) {
        }
    }

    /* compiled from: VkLeaderboardFragment.kt */
    public static final class b extends BottomSheetBehavior.d {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == 5) {
                b2v0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
        }
    }
}
