package xsna;

import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.o1j;
import xsna.r2j;
import xsna.v1j;

/* compiled from: CreateRoomsViewRenderer.kt */
/* loaded from: classes7.dex */
public final class lak extends LinearLayoutCompat implements gm50, o1j.a {
    public final Object A;
    public final n1j q;
    public final e89 r;
    public final EditText s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final VoipActionMultiLineView w;
    public final Object x;
    public final Object y;
    public final View z;

    public lak(n1j n1jVar, io.reactivex.rxjava3.disposables.b bVar, e89 e89Var) {
        super(n1jVar.requireContext(), null);
        this.q = n1jVar;
        this.r = e89Var;
        q5f q5fVar = new q5f(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, q5fVar);
        this.u = msy.a(lazyThreadSafetyMode, new defpackage.f0(11, this, bVar));
        this.v = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.f(this, 28));
        this.x = msy.a(lazyThreadSafetyMode, new yce(this, 11));
        this.y = msy.a(lazyThreadSafetyMode, new k5h(this, 6));
        this.A = msy.a(lazyThreadSafetyMode, new c5f(this, 9));
        LayoutInflater.from(getContext()).inflate(R.layout.voip_session_rooms_admin_configure_rooms_dialog_create, (ViewGroup) this, true);
        final EditText editText = (EditText) findViewById(R.id.voip_count_of_rooms_input);
        this.s = editText;
        editText.addTextChangedListener(new vzb0(editText, new k9x(1, 99, 1), bVar, new wcg(this, 6)));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.o1p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                EditText editText2 = editText;
                if (editText2.getText().toString().length() == 0) {
                    p1p.a(editText2, 2);
                }
            }
        });
        VoipActionMultiLineView voipActionMultiLineView = (VoipActionMultiLineView) findViewById(R.id.voip_spread_users_to_rooms_randomly_switch);
        this.w = voipActionMultiLineView;
        voipActionMultiLineView.setSwitchListener(new dac(this, 1));
        View findViewById = findViewById(R.id.create_rooms_button);
        this.z = findViewById;
        bwt0.i0(findViewById, new d9j(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VoipActionMultiLineView getSetTimeLimitSwitchView() {
        return (VoipActionMultiLineView) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final EditText getTimeLimitInput() {
        return (EditText) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextWatcher getTimeLimitInputTextWatcher() {
        return (TextWatcher) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextInputLayout getTimeLimitInputView() {
        return (TextInputLayout) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final iak getTimeLimitPresets() {
        return (iak) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getWrongCountErrorView() {
        return (TextView) this.A.getValue();
    }

    public static s3q0 k(lak lakVar, int i) {
        EditText timeLimitInput = lakVar.getTimeLimitInput();
        TextWatcher timeLimitInputTextWatcher = lakVar.getTimeLimitInputTextWatcher();
        if (!epx.f(timeLimitInput.getText().toString(), String.valueOf(i))) {
            timeLimitInput.removeTextChangedListener(timeLimitInputTextWatcher);
            timeLimitInput.setText(i == 0 ? "" : String.valueOf(i));
            timeLimitInput.setSelection(timeLimitInput.getText().length());
            timeLimitInput.addTextChangedListener(timeLimitInputTextWatcher);
        }
        final iak timeLimitPresets = lakVar.getTimeLimitPresets();
        if (i != timeLimitPresets.c) {
            timeLimitPresets.c = i;
            ArrayList a = timeLimitPresets.a();
            Iterator it = a.iterator();
            final int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((fak) it.next()).c) {
                    break;
                }
                i2++;
            }
            timeLimitPresets.b.setItems(a);
            if (i2 > 0) {
                timeLimitPresets.a.post(new Runnable() { // from class: xsna.hak
                    @Override // java.lang.Runnable
                    public final void run() {
                        iak.this.a.smoothScrollToPosition(i2);
                    }
                });
            }
        }
        return s3q0.a;
    }

    public static s3q0 l(lak lakVar, boolean z) {
        lakVar.getSetTimeLimitSwitchView().setChecked(z);
        bwt0.p0(lakVar.getTimeLimitInputView(), z);
        bwt0.p0(lakVar.getTimeLimitPresets().a, z);
        return s3q0.a;
    }

    public static vzb0 m(lak lakVar, io.reactivex.rxjava3.disposables.b bVar) {
        return new vzb0(lakVar.getTimeLimitInput(), new k9x(1, 999, 1), bVar, new rlh(lakVar, 2));
    }

    public static final void n(lak lakVar, r2j.c cVar) {
        if (cVar instanceof r2j.c.C3594c) {
            TextView wrongCountErrorView = lakVar.getWrongCountErrorView();
            Context context = lakVar.getContext();
            ((r2j.c.C3594c) cVar).getClass();
            wrongCountErrorView.setText(context.getString(R.string.voip_session_room_admin_wrong_rooms_count_error, 1, 50));
            bwt0.p0(lakVar.getWrongCountErrorView(), true);
            return;
        }
        TextView wrongCountErrorView2 = lakVar.getWrongCountErrorView();
        e89 e89Var = lakVar.r;
        bwt0.p0(wrongCountErrorView2, false);
        if (cVar instanceof r2j.c.a) {
            String string = lakVar.getContext().getString(((r2j.c.a) cVar).a);
            e89Var.invoke(v1j.g.b);
            cvk.w(string, false);
        } else if (cVar instanceof r2j.c.d) {
            r2j.c.d dVar = (r2j.c.d) cVar;
            String string2 = lakVar.getContext().getString(dVar.a, dVar.b);
            e89Var.invoke(v1j.g.b);
            cvk.w(string2, false);
        }
    }

    @Override // xsna.o1j.a
    public final void a() {
        bwt0.j(this.s, new tr0(14));
    }

    @Override // xsna.gm50
    public f5z getViewOwner() {
        return this.q;
    }
}
