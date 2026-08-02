package defpackage;

import com.adjust.sdk.Constants;
import java.util.List;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class lwi0 extends fnr0 {
    public final String a;
    public final String b;

    public lwi0() {
        super(0);
        this.a = Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH;
        this.b = "RemoteTrackersSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        a aVar = bVar instanceof a ? (a) bVar : null;
        if (aVar == null || aVar.a.size() != 0) {
            return new kwi0((List) sbxVar.a(new p53(gtq0.B(sbxVar.b, qoi0.a(t9.class)), 0), bVar));
        }
        return null;
    }
}
