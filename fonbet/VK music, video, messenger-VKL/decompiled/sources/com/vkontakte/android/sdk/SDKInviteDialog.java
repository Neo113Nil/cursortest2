package com.vkontakte.android.sdk;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import xsna.afa0;
import xsna.asu0;
import xsna.cx00;
import xsna.drm0;
import xsna.h7u0;
import xsna.kdw;
import xsna.kxa0;
import xsna.lw20;
import xsna.q440;
import xsna.rsg0;
import xsna.rtg0;
import xsna.sl30;
import xsna.t440;
import xsna.tcu;
import xsna.tl30;
import xsna.ts8;
import xsna.v01;
import xsna.ver0;

/* compiled from: SDKInviteDialog.kt */
/* loaded from: classes7.dex */
public final class SDKInviteDialog extends FragmentImpl {
    public static final /* synthetic */ int X = 0;
    public CharSequence N;
    public CharSequence O;
    public CharSequence P;
    public a Q;
    public EditText R;
    public ImageView S;
    public TextView T;
    public View U;
    public Bitmap V;
    public volatile String W;

    /* compiled from: SDKInviteDialog.kt */
    public interface a {
        void c1();

        void s0(Editable editable, CharSequence charSequence, CharSequence charSequence2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        q T;
        super.onActivityCreated(bundle);
        if (bundle == null) {
            this.R.setText(this.N);
            EditText editText = this.R;
            editText.setSelection(editText.getText().length());
            TextView textView = this.T;
            String valueOf = String.valueOf(this.O);
            int K = drm0.K(0, 6, valueOf, "://", false);
            if (K != -1) {
                valueOf = valueOf.substring(K + 3, valueOf.length());
            }
            textView.setText(valueOf);
            this.T.setOnClickListener(new v01(this, 9));
        }
        Bitmap bitmap = this.V;
        if (bitmap != null) {
            this.S.setImageBitmap(bitmap);
            this.U.setVisibility(8);
            return;
        }
        CharSequence charSequence = this.P;
        if (charSequence != null) {
            String str = this.W;
            if (str == null) {
                String obj = charSequence.toString();
                afa0 afa0Var = new afa0("photos.getById");
                afa0Var.s = 604;
                afa0Var.K("photos", obj);
                afa0Var.C(0, "extended");
                afa0Var.C(0, "photo_sizes");
                T = rsg0.T(afa0Var);
            } else {
                T = q.T(str);
            }
            sl30 sl30Var = new sl30(new rtg0(this, 1), 21);
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            ver0.b(kn(), new c0(T, sl30Var, kVar).E(new tl30(new lw20(this, 27), 20), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar).a0(asu0.a.c()).L(new kxa0(new tcu(25), 5), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cx00(new t440(this, 20), 21), new q440(new kdw(19), 16)));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.Q = (a) getActivity();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        An(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.N = arguments.getCharSequence("com.vkontakte.android.sdk.extra_message");
            this.O = arguments.getCharSequence("com.vkontakte.android.sdk.extra_link");
            this.P = arguments.getCharSequence("com.vkontakte.android.sdk.extra_photo");
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.N = null;
        this.O = null;
        this.P = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.Q = null;
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        ts8 ts8Var = new ts8(this, 3);
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.sdk_invite_dialog, (ViewGroup) null, false);
        this.R = (EditText) inflate.findViewById(R.id.message);
        this.T = (TextView) inflate.findViewById(R.id.link);
        this.S = (ImageView) inflate.findViewById(R.id.banner);
        this.U = inflate.findViewById(R.id.progress);
        h7u0.a aVar = new h7u0.a(kn());
        aVar.c = false;
        aVar.f = inflate;
        aVar.g0(R.string.sdk_invite_dialog_title);
        aVar.W(R.string.cancel, ts8Var);
        aVar.c0(R.string.send, ts8Var);
        return aVar.create();
    }
}
