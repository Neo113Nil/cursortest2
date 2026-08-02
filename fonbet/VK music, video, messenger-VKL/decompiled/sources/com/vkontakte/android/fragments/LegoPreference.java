package com.vkontakte.android.fragments;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.prefui.views.MaterialSwitchPreference;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.b0r0;
import xsna.f30;
import xsna.h7u0;
import xsna.z1z;

/* compiled from: LegoPreference.kt */
/* loaded from: classes7.dex */
public final class LegoPreference extends MaterialSwitchPreference {
    public LegoPreference(Context context) {
        super(context);
        this.w = Boolean.valueOf(com.vk.toggle.d.n().b);
    }

    @Override // androidx.preference.Preference
    public final boolean a(Object obj) {
        JSONObject jSONObject;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        CoreFeatures coreFeatures = CoreFeatures.LEGO_REDESIGN;
        b.d i = com.vk.toggle.b.A.i(coreFeatures);
        b.d dVar = i == null ? new b.d(coreFeatures.getKey()) : i;
        if (i == null) {
            b0r0.d.c(new b.d(coreFeatures.getKey()));
        }
        b0r0 b0r0Var = new b0r0(dVar);
        if (booleanValue) {
            try {
                jSONObject = new JSONObject(b0r0Var.c.toString());
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("enabled_everywhere", true);
            b0r0Var.c = jSONObject.toString();
            b0r0Var.a = true;
        } else {
            b0r0Var.a = false;
        }
        if (b0r0.d.c(b0r0Var)) {
            int i2 = h7u0.p;
            h7u0.a c = h7u0.b.c(this.b);
            c.a.f = "Для применения настройки редизайна необходимо перезапустить приложение";
            c.X("Отмена", new f30(1));
            c.d0("Перезапустить", new z1z(this, 0));
            c.m();
        }
        return true;
    }

    public LegoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = Boolean.valueOf(com.vk.toggle.d.n().b);
    }

    public LegoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = Boolean.valueOf(com.vk.toggle.d.n().b);
    }

    public LegoPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.w = Boolean.valueOf(com.vk.toggle.d.n().b);
    }
}
