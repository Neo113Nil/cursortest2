package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.superapp.browser.internal.ui.changephone.a;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.regex.Pattern;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dlw0;
import xsna.dw20;
import xsna.mjw0;
import xsna.owm;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d8t0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d8t0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, io.reactivex.rxjava3.internal.disposables.EmptyDisposable] */
    @Override // xsna.gzs
    public final Object invoke() {
        ClipData primaryClip;
        Void y;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VideoProfileFragmentOld.p0;
                xn50.a.c((VideoProfileFragmentOld) obj, a.t.b);
                return s3q0.a;
            case 1:
                return new ibt0((hbt0) obj);
            case 2:
                return ((VideoShareComponent) m7m.d((ect0) obj).a(fpf0.a(VideoShareComponent.class))).S();
            case 3:
                return (zia) ((qot0) obj).b.getValue();
            case 4:
                ((q9u0) obj).O(owm.b.b);
                return s3q0.a;
            case 5:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                ListBuilder e = e43.e();
                if (epx.f(e370.s != null ? Boolean.valueOf(com.vk.toggle.b.A.a(SaFeatures.SA_FIX_BLINKING_AFTER_EXIT_APP)) : null, Boolean.TRUE)) {
                    e.add(new yix0(aVar.un()));
                }
                return e.g();
            case 6:
                return new a.b((com.vk.superapp.browser.internal.ui.changephone.a) obj);
            case 7:
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = (VkTopBarSearchQueryVh) obj;
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                Context context = e43.a;
                return (context != null ? context : null).getString(vkTopBarSearchQueryVh.b);
            case 8:
                VkContextMenu vkContextMenu = (VkContextMenu) ((Ref$ObjectRef) obj).element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                return s3q0.a;
            case 9:
                return ((pzv0) obj).a;
            case 10:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i3 = VoipCallServiceFragment.Y;
                if (((b25) voipCallServiceFragment.Q.getValue()).b()) {
                    ((VoipCallsJoinRouterComponent) m7m.d(voipCallServiceFragment).a(fpf0.a(VoipCallsJoinRouterComponent.class))).a().a(voipCallServiceFragment.requireContext(), dlw0.b.a, null);
                } else {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    dw20.b bVar = new dw20.b(voipCallServiceFragment.requireContext(), null);
                    SharedPreferences sharedPreferences = i0y.a;
                    LayoutInflater layoutInflater = voipCallServiceFragment.getLayoutInflater();
                    final yku ykuVar = new yku(11, voipCallServiceFragment, ref$ObjectRef);
                    View inflate = layoutInflater.inflate(R.layout.voip_calls_external_join_call_by_link, (ViewGroup) null, false);
                    final EditText editText = (EditText) inflate.findViewById(R.id.insert_link);
                    final EditText editText2 = (EditText) inflate.findViewById(R.id.insert_name);
                    final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.remember_name_checkbox);
                    TextView textView = (TextView) inflate.findViewById(R.id.continue_btn);
                    Context context2 = inflate.getContext();
                    ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                    if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
                        String obj2 = primaryClip.getItemAt(0).coerceToText(context2).toString();
                        i0y.b.getClass();
                        if (c49.a.matcher(obj2).matches() && (((Pattern) c49.b.getValue()).matcher(obj2).matches() || ((Pattern) c49.c.getValue()).matcher(obj2).matches() || ((Pattern) c49.d.getValue()).matcher(obj2).matches())) {
                            editText.setText(obj2);
                        }
                    }
                    a1t a1tVar = new a1t(editText, editText2, textView, 1);
                    if (editText != null) {
                        editText.addTextChangedListener(new g0y(a1tVar));
                    }
                    if (o25.a().b()) {
                        editText2.setVisibility(8);
                        editText2.setText(o25.a().o().a());
                        checkBox.setVisibility(8);
                    } else {
                        if (editText2 != null) {
                            editText2.addTextChangedListener(new h0y(a1tVar));
                        }
                        SharedPreferences sharedPreferences2 = i0y.a;
                        String string = sharedPreferences2.getString("remember_name", null);
                        if (string != null && string.length() > 0) {
                            editText2.setText(string);
                        }
                        checkBox.setChecked(sharedPreferences2.getString("remember_name", null) != null);
                    }
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = EmptyDisposable.INSTANCE;
                    inflate.addOnAttachStateChangeListener(new f0y(inflate, ref$ObjectRef2));
                    jjc.g(textView, new izs() { // from class: xsna.e0y
                        /* JADX WARN: Type inference failed for: r0v4, types: [T, io.reactivex.rxjava3.disposables.c] */
                        @Override // xsna.izs
                        public final Object invoke(Object obj3) {
                            String obj4 = drm0.p0(editText.getText().toString()).toString();
                            boolean b = o25.a().b();
                            yku ykuVar2 = ykuVar;
                            if (b) {
                                ykuVar2.invoke(obj4, null);
                            } else {
                                EditText editText3 = editText2;
                                String obj5 = drm0.p0(editText3.getText().toString()).toString();
                                Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                                ((io.reactivex.rxjava3.disposables.c) ref$ObjectRef3.element).dispose();
                                ref$ObjectRef3.element = i0y.c.b(obj5).subscribe(new hms(new ta5(checkBox, obj5, ykuVar2, obj4, editText3, 1), 5));
                            }
                            return s3q0.a;
                        }
                    });
                    a1tVar.run();
                    ref$ObjectRef.element = bVar.D0(inflate, false).a0(new ufu0(voipCallServiceFragment, 8)).I0("JoinDialog");
                }
                return s3q0.a;
            case 11:
                mjw0 mjw0Var = (mjw0) obj;
                mjw0.a aVar2 = mjw0Var.c;
                VoipViewBehaviour voipViewBehaviour = mjw0Var.y;
                aVar2.a = 16.0f / voipViewBehaviour.g();
                float g = 1.0f / voipViewBehaviour.g();
                ViewGroup viewGroup = mjw0Var.q0;
                viewGroup.setScaleX(g);
                viewGroup.setScaleY(g);
                FrameLayout frameLayout = mjw0Var.r;
                frameLayout.setOutlineProvider(null);
                frameLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                FrameLayout frameLayout2 = mjw0Var.o;
                frameLayout2.setOutlineProvider(aVar2);
                frameLayout2.setElevation(iah0.b(4.0f));
                mjw0.u(mjw0Var, mjw0Var.q0, true, false, 12);
                mjw0Var.y();
                return s3q0.a;
            case 12:
                return ((VoipDataProvider.c) obj).e.getValue().f();
            case 13:
                ((maj) obj).invoke();
                return s3q0.a;
            case 14:
                com.vk.writebar.c cVar = (com.vk.writebar.c) obj;
                ImFeatures imFeatures = ImFeatures.BLUR_POST;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures) && !cVar.b.getState().t) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                y = ((ru.mail.libverify.api.s) obj).y();
                return y;
        }
    }
}
