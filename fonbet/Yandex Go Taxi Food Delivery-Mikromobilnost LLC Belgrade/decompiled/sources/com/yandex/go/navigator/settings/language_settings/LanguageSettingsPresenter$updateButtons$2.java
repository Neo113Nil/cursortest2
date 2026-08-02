package com.yandex.go.navigator.settings.language_settings;

import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import defpackage.i650;
import defpackage.jl40;
import defpackage.n;
import defpackage.ptw;
import defpackage.sls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class LanguageSettingsPresenter$updateButtons$2 extends FunctionReferenceImpl implements sls {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r2 == null) goto L13;
     */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        NavigatorLanguageSettingAvailabilityExperiment.Language language;
        Object obj;
        a aVar = (a) this.receiver;
        ListBuilder listBuilder = aVar.J;
        if (listBuilder != null) {
            Iterator<E> it = listBuilder.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Language) obj).c, aVar.B.a())) {
                    break;
                }
            }
            language = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj;
        }
        ListBuilder listBuilder2 = aVar.J;
        NavigatorLanguageSettingAvailabilityExperiment.Language language2 = listBuilder2 != null ? (NavigatorLanguageSettingAvailabilityExperiment.Language) kotlin.collections.a.R(listBuilder2) : null;
        if (language2 != null) {
            language = language2;
            i650 i650Var = aVar.G.a;
            i650Var.a.a("navigation.settings.language.select_voice", n.u(i650Var), 1, new HashMap());
            aVar.F.a.r(new ptw(4, language));
        }
        return zy11.a;
    }
}
