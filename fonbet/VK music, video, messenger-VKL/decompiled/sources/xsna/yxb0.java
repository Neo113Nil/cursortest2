package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yxb0 implements izs {
    public final /* synthetic */ dyb0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ yxb0(dyb0 dyb0Var, long j, boolean z, boolean z2) {
        this.b = dyb0Var;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, xsna.zxb0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final dyb0 dyb0Var = this.b;
        View view = dyb0Var.g;
        if (view != null) {
            Context context = view.getContext();
            final SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.stickers_popup_animation_autoplay_checkbox);
            TextView textView = (TextView) view.findViewById(R.id.stickers_popup_animation_autoplay_subtitle);
            view.setVisibility(0);
            boolean z = this.e;
            if (z || !this.d) {
                switchCompat.setChecked(false);
                switchCompat.setEnabled(false);
                if (z) {
                    textView.setText(context.getString(R.string.vkim_chat_theme_popup_stickers_autoplay_subtitle_when_disabled_by_admin));
                } else {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_chat_theme_popup_stickers_autoplay_subtitle_when_disabled_by_user_1));
                    spannableStringBuilder.append(context.getString(R.string.vkim_chat_theme_popup_stickers_autoplay_subtitle_when_disabled_by_user_2), new cyb0(context), 33);
                    textView.setText(new SpannedString(spannableStringBuilder));
                }
            } else {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final long j = this.c;
                ref$ObjectRef.element = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.zxb0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        t6g0 t6g0Var = t6g0.b;
                        myb0 I0 = t6g0.d().I0();
                        long j2 = j;
                        io.reactivex.rxjava3.internal.operators.single.b0 m = I0.g(j2, z2).m(asu0.a.d());
                        final SwitchCompat switchCompat2 = switchCompat;
                        io.reactivex.rxjava3.internal.operators.single.n nVar = new io.reactivex.rxjava3.internal.operators.single.n(m, new q440(new gj80(switchCompat2, 4), 13));
                        final Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(nVar, new io.reactivex.rxjava3.functions.a() { // from class: xsna.ayb0
                            @Override // io.reactivex.rxjava3.functions.a
                            public final void run() {
                                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = (CompoundButton.OnCheckedChangeListener) ref$ObjectRef2.element;
                                SwitchCompat switchCompat3 = SwitchCompat.this;
                                switchCompat3.setOnCheckedChangeListener(onCheckedChangeListener);
                                switchCompat3.setEnabled(true);
                            }
                        });
                        tmz tmzVar = new tmz(new byb0(switchCompat2, j2), 8);
                        dyb0 dyb0Var2 = dyb0Var;
                        dyb0Var2.I0(jVar.subscribe(tmzVar, new le50(new m9(27, switchCompat2, dyb0Var2), 7)));
                    }
                };
                switchCompat.setEnabled(true);
                switchCompat.setChecked(booleanValue);
                switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) ref$ObjectRef.element);
                textView.setText(context.getString(R.string.vkim_chat_theme_popup_stickers_autoplay_subtitle));
            }
        }
        return s3q0.a;
    }
}
