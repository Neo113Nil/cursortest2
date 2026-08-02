package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: FragmentExt.kt */
/* loaded from: classes18.dex */
public final class qas implements i7f0 {
    public final Object b;
    public final Object c;
    public Object d;

    public qas(io70 io70Var, Context context) {
        this.b = io70Var;
        this.c = context;
        this.d = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }

    public String a() {
        String str;
        ((io70) this.b).getClass();
        dhw0 dhw0Var = OKVoipEngine.B;
        VoipChatInfo voipChatInfo = dhw0Var != null ? dhw0Var.B : null;
        return (voipChatInfo == null || (str = voipChatInfo.c) == null) ? ((Context) this.c).getString(R.string.voip_broadcast_chat_title, ((SimpleDateFormat) this.d).format(new Date())) : str;
    }

    public Object b(Fragment fragment) {
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        Bundle arguments = fragment.getArguments();
        Object obj2 = arguments != null ? arguments.get((String) this.b) : null;
        Object obj3 = obj2 != null ? obj2 : null;
        if (obj3 == null) {
            obj3 = this.c;
        }
        this.d = obj3;
        return obj3;
    }

    public void c() {
        ((com.vk.newsfeed.common.recycler.holders.attachments.a) this.d).invoke();
    }

    @Override // xsna.i7f0
    public /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
        return b((Fragment) obj);
    }

    public qas(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public qas(LinkedHashMap linkedHashMap, zu1 zu1Var, com.vk.newsfeed.common.recycler.holders.attachments.a aVar) {
        this.b = linkedHashMap;
        this.c = zu1Var;
        this.d = aVar;
    }
}
