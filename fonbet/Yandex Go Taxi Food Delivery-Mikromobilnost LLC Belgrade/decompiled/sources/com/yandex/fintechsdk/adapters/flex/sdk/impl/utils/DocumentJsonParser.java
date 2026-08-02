package com.yandex.fintechsdk.adapters.flex.sdk.impl.utils;

import defpackage.acx;
import defpackage.bvf0;
import defpackage.c0m;
import defpackage.d0m;
import defpackage.dbb1;
import defpackage.gtq0;
import defpackage.itq0;
import defpackage.kf5;
import defpackage.ndx;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ywl;
import defpackage.zcx;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import kotlinx.serialization.modules.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/utils/DocumentJsonParser;", "", "Ld0m;", "documentJsonProvider", "<init>", "(Ld0m;)V", "", "", "documentJson", "Lywl;", "parse", "(Ljava/util/Map;)Lywl;", "Ld0m;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentJsonParser {
    private final d0m documentJsonProvider;

    public DocumentJsonParser(d0m d0mVar) {
        this.documentJsonProvider = d0mVar;
    }

    public final ywl parse(Map<String, ? extends Object> documentJson) {
        try {
            b d = dbb1.d(documentJson);
            final ndx a = this.documentJsonProvider.a(new c0m(0));
            zcx a2 = tje.a(a.a, new tls() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentJsonParser$parse$$inlined$create$1
                public final void invoke(acx acxVar) {
                    kf5 kf5Var = ndx.this.a.b;
                    a aVar = new a();
                    bvf0.b0(aVar);
                    acxVar.n = itq0.a(kf5Var, aVar.a());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((acx) obj);
                    return zy11.a;
                }
            });
            return (ywl) a2.a(gtq0.B(a2.b, qoi0.a(ywl.class)), d);
        } catch (Exception unused) {
            return null;
        }
    }
}
