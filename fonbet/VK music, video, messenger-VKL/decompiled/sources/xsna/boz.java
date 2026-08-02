package xsna;

import android.view.View;
import com.vk.clips.design.view.camera.settings.ModalPrivacySettingsErrorView;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import java.util.Iterator;
import java.util.List;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: LivesGroupPrivacyBottomSheet.kt */
/* loaded from: classes17.dex */
public final class boz extends dw20.b {
    public final l7s e;
    public final klu f;
    public final g1j g;
    public final pw h;
    public final boolean i;
    public final String j;
    public List<ModalSettingsPrivacyOption> k;
    public View l;
    public ModalPrivacySettingsErrorView m;
    public dw20 n;

    public boz(l7s l7sVar, klu kluVar, g1j g1jVar, pw pwVar, tzp0.c.a aVar, boolean z) {
        super(l7sVar, aVar);
        this.e = l7sVar;
        this.f = kluVar;
        this.g = g1jVar;
        this.h = pwVar;
        this.i = z;
        this.j = "LivesGroupPrivacyBottomSheet";
    }

    public final klu S0() {
        Object obj;
        List<ModalSettingsPrivacyOption> list = this.k;
        if (list == null) {
            list = null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ModalSettingsPrivacyOption) obj).d) {
                break;
            }
        }
        ModalSettingsPrivacyOption modalSettingsPrivacyOption = (ModalSettingsPrivacyOption) obj;
        return (klu) (modalSettingsPrivacyOption != null ? modalSettingsPrivacyOption.getTag() : null);
    }

    public final void T0(klu kluVar) {
        List<ModalSettingsPrivacyOption> list = this.k;
        if (list == null) {
            list = null;
        }
        for (ModalSettingsPrivacyOption modalSettingsPrivacyOption : list) {
            modalSettingsPrivacyOption.setCheckVisible(epx.f(modalSettingsPrivacyOption.getTag(), kluVar));
        }
    }
}
