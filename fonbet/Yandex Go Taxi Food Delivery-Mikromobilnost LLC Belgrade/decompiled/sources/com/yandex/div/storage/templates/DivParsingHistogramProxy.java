package com.yandex.div.storage.templates;

import defpackage.ag90;
import defpackage.gtq0;
import defpackage.hah;
import defpackage.i3y;
import defpackage.kvo;
import defpackage.lfy0;
import defpackage.omk;
import defpackage.sls;
import defpackage.u2l;
import defpackage.v2l;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00038RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "", "Lkotlin/Function0;", "Lv2l;", "initReporter", "<init>", "(Lsls;)V", "Lag90;", "env", "Lorg/json/JSONObject;", "json", "", "componentName", "Lomk;", "a", "(Lag90;Lorg/json/JSONObject;Ljava/lang/String;)Lomk;", "Lu2l;", "templates", "Llfy0;", "Lxel;", "c", "(Lu2l;Lorg/json/JSONObject;Ljava/lang/String;)Llfy0;", "Li3y;", "b", "()Lv2l;", "reporter", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class DivParsingHistogramProxy {

    /* renamed from: a, reason: from kotlin metadata */
    private final i3y reporter;

    public DivParsingHistogramProxy(sls slsVar) {
        this.reporter = kotlin.a.a(slsVar);
    }

    private v2l b() {
        return (v2l) this.reporter.getValue();
    }

    public final omk a(final ag90 env, final JSONObject json2, String componentName) {
        v2l b = b();
        sls slsVar = new sls() { // from class: com.yandex.div.storage.templates.DivParsingHistogramProxy$createDivData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final omk invoke() {
                kvo kvoVar = omk.i;
                return gtq0.n(ag90.this, json2);
            }
        };
        ((hah) b).getClass();
        return (omk) slsVar.invoke();
    }

    public final lfy0 c(final u2l env, final JSONObject templates, String componentName) {
        v2l b = b();
        sls slsVar = new sls() { // from class: com.yandex.div.storage.templates.DivParsingHistogramProxy$parseTemplatesWithResultsAndDependencies$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final lfy0 invoke() {
                return u2l.this.f(templates);
            }
        };
        ((hah) b).getClass();
        return (lfy0) slsVar.invoke();
    }
}
