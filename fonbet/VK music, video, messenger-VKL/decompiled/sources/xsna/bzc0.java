package xsna;

import androidx.preference.Preference;
import com.vk.music.mixsettings.MixCategoryEntity;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningEvent;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningPlayEvent;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningStopEvent;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioAudioListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioListeningItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import xsna.h4v0;
import xsna.h8z0;
import xsna.hjz0;
import xsna.j6v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bzc0 implements Preference.b, io.reactivex.rxjava3.core.d, Optional.Action, io.reactivex.rxjava3.core.a0, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bzc0(Preference.b bVar, czc0 czc0Var, Preference preference) {
        this.b = bVar;
        this.c = preference;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        Preference.b bVar = (Preference.b) this.b;
        Preference preference2 = (Preference) this.c;
        boolean z = bVar == null || bVar.Sl(preference, obj);
        if (!z) {
            obj = null;
        }
        czc0.b(preference2, obj);
        return z;
    }

    @Override // xsna.h8z0.b
    public void a() {
        p4z0 p4z0Var = (p4z0) this.b;
        xey0 xey0Var = (xey0) this.c;
        hjz0.a aVar = p4z0Var.a;
        String str = xey0Var.F;
        yil0.d(aVar);
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onCallUIDescriptorChanged$35((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        lsg0 lsg0Var = (lsg0) this.b;
        wrw wrwVar = (wrw) this.c;
        lsg0Var.d.l("complete rustore update:" + wrwVar);
        com.vk.metrics.eventtracking.b.a.m(Long.valueOf(wrwVar.b), "CRUCIAL.UPDATE", "version");
        d5o0<s3q0> b = ((wqg0) lsg0Var.e.getValue()).b(new AppUpdateOptions.Builder().appUpdateType(0).build());
        b.b(new xx40(bVar, 7), null);
        b.b(null, new hsg0(lsg0Var, wrwVar, bVar));
    }

    public /* synthetic */ bzc0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        HashMap hashMap;
        LinkedHashMap linkedHashMap;
        Pair pair;
        CommonAudioStat$AudioListeningPlayEvent.Subtype a;
        String name;
        CommonAudioStat$AudioListeningPlayEvent.Type b;
        String name2;
        Integer c;
        CommonAudioStat$AudioListeningStopEvent.Subtype a2;
        String name3;
        CommonAudioStat$AudioListeningStopEvent.Type b2;
        String name4;
        h4v0 h4v0Var = (h4v0) this.b;
        s940 s940Var = (s940) this.c;
        StartPlayVkMixSource startPlayVkMixSource = h4v0Var.f;
        MixSettingsEntity mixSettingsEntity = startPlayVkMixSource.h;
        if (mixSettingsEntity != null) {
            List<MixCategoryEntity> list = mixSettingsEntity.e;
            hashMap = new HashMap(list.size());
            for (MixCategoryEntity mixCategoryEntity : list) {
                hashMap.put(mixCategoryEntity.b, mixCategoryEntity);
            }
        } else {
            hashMap = null;
        }
        if (hashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                List<MixOptionEntity> list2 = ((MixCategoryEntity) entry.getValue()).e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((MixOptionEntity) obj).f) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((MixOptionEntity) it.next()).b);
                }
                linkedHashMap2.put(key, arrayList2);
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((List) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        String jSONObject = d370.C(new q7a0(14, startPlayVkMixSource, linkedHashMap)).toString();
        List<ax1> e = h4v0Var.a.e(s940Var);
        j6v0 j6v0Var = h4v0Var.e;
        String zb = h4v0Var.b.b.zb();
        j6v0Var.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : e) {
            if (obj2 instanceof cv40) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem = ((cv40) it2.next()).b;
            CommonAudioStat$AudioListeningEvent g = commonAudioStat$TypeAudioListeningItem.g();
            CommonAudioStat$AudioListeningEvent.Type c2 = g != null ? g.c() : null;
            int i = c2 == null ? -1 : j6v0.a.$EnumSwitchMapping$0[c2.ordinal()];
            if (i == 1) {
                CommonAudioStat$AudioListeningPlayEvent a3 = g.a();
                String m = (a3 == null || (b = a3.b()) == null || (name2 = b.name()) == null) ? null : cqm0.m(name2);
                if (m == null) {
                    m = "";
                }
                String m2 = (a3 == null || (a = a3.a()) == null || (name = a.name()) == null) ? null : cqm0.m(name);
                pair = new Pair(m, m2 != null ? m2 : "");
            } else if (i != 2) {
                pair = new Pair("", "");
            } else {
                CommonAudioStat$AudioListeningStopEvent b3 = g.b();
                String m3 = (b3 == null || (b2 = b3.b()) == null || (name4 = b2.name()) == null) ? null : cqm0.m(name4);
                if (m3 == null) {
                    m3 = "";
                }
                String m4 = (b3 == null || (a2 = b3.a()) == null || (name3 = a2.name()) == null) ? null : cqm0.m(name3);
                pair = new Pair(m3, m4 != null ? m4 : "");
            }
            String str = (String) pair.d();
            String str2 = (String) pair.g();
            CommonAudioStat$TypeAudioAudioListeningItem t = commonAudioStat$TypeAudioListeningItem.t();
            long b4 = t != null ? t.b() : 0L;
            int i2 = 0;
            int a4 = t != null ? t.a() : 0;
            if (t != null && (c = t.c()) != null) {
                i2 = c.intValue();
            }
            arrayList4.add(new c4v0(str, str2, b4, a4, i2, commonAudioStat$TypeAudioListeningItem.d(), commonAudioStat$TypeAudioListeningItem.a, zb));
        }
        yVar.onSuccess(new h4v0.a(jSONObject, kvf.a(arrayList4).toString()));
    }
}
