package com.yandex.quark.debug;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import defpackage.evu0;
import defpackage.g45;
import defpackage.gah0;
import defpackage.jyj0;
import defpackage.lyj0;
import defpackage.mmh0;
import defpackage.ny61;
import defpackage.sig0;
import defpackage.syj0;
import defpackage.uwg;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/quark/debug/DebugSettingsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Luwg;", "debugSettings", "<init>", "(Landroid/content/Context;Luwg;)V", "", "experimentsString", "", "parseExperimentsToList", "(Ljava/lang/String;)Ljava/util/List;", "quark-core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugSettingsView extends FrameLayout {
    public DebugSettingsView(Context context, uwg uwgVar) {
        super(context);
        LayoutInflater.from(context).inflate(mmh0.debug_settings_view, (ViewGroup) this, true);
        ((Button) findViewById(gah0.setValuesButton)).setOnClickListener(new g45(context, (EditText) findViewById(gah0.uniproxyUrlEditText), (EditText) findViewById(gah0.vinsUrlEditText), this, (EditText) findViewById(gah0.experimentsEditText), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(uwg uwgVar, Context context, EditText editText, EditText editText2, DebugSettingsView debugSettingsView, EditText editText3, View view) {
        ArrayList arrayList = new ArrayList();
        editText.getText().toString();
        syj0 a = uwgVar.a();
        a.getClass();
        if (!(a instanceof lyj0)) {
            if (!(a instanceof jyj0)) {
                w511.b();
                return;
            } else {
                if (((jyj0) a).a != null) {
                    ny61.u();
                    return;
                }
                lambda$4$lambda$3$lambda$0(arrayList, null);
            }
        }
        editText2.getText().toString();
        syj0 b = uwgVar.b();
        b.getClass();
        if (!(b instanceof lyj0)) {
            if (!(b instanceof jyj0)) {
                w511.b();
                return;
            } else {
                if (((jyj0) b).a != null) {
                    ny61.u();
                    return;
                }
                lambda$4$lambda$3$lambda$1(arrayList, null);
            }
        }
        debugSettingsView.parseExperimentsToList(editText3.getText().toString());
        syj0 c = uwgVar.c();
        c.getClass();
        if (!(c instanceof lyj0)) {
            if (!(c instanceof jyj0)) {
                w511.b();
                return;
            } else {
                if (((jyj0) c).a != null) {
                    ny61.u();
                    return;
                }
                lambda$4$lambda$3$lambda$2(arrayList, null);
            }
        }
        if (arrayList.isEmpty()) {
            Toast.makeText(context, "New settings applied", 0).show();
            return;
        }
        Toast.makeText(context, "Error(s) while setting values: " + arrayList, 1).show();
    }

    private static final boolean lambda$4$lambda$3$lambda$0(List list, sig0 sig0Var) {
        throw null;
    }

    private static final boolean lambda$4$lambda$3$lambda$1(List list, sig0 sig0Var) {
        throw null;
    }

    private static final boolean lambda$4$lambda$3$lambda$2(List list, sig0 sig0Var) {
        throw null;
    }

    private final List<String> parseExperimentsToList(String experimentsString) {
        return evu0.Y(experimentsString, new char[]{HexString.CHAR_COMMA}, 0, 6);
    }
}
