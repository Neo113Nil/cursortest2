package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Locm;", "Lr73;", "Companion", "kcm", "mcm", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ocm implements r73 {
    public static final mcm Companion = new mcm();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jbm(1)), null};
    public final String a;
    public final List b;
    public final b c;
    public final i3y d;

    public /* synthetic */ ocm(int i, String str, List list, b bVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
        final int i2 = 0;
        this.d = a.a(new sls(this) { // from class: icm
            public final /* synthetic */ ocm b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                ocm ocmVar = this.b;
                switch (i3) {
                    case 0:
                        mcm mcmVar = ocm.Companion;
                        break;
                    default:
                        mcm mcmVar2 = ocm.Companion;
                        break;
                }
                return new FormattedText(ocmVar.b);
            }
        });
    }

    @Override // defpackage.r73
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocm)) {
            return false;
        }
        ocm ocmVar = (ocm) obj;
        return jl40.l(this.a, ocmVar.a) && jl40.l(this.b, ocmVar.b) && jl40.l(this.c, ocmVar.c);
    }

    @Override // defpackage.r73
    /* renamed from: getItems, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        return c + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder r = xvz.r("Drive(color=", this.a, ", items=", this.b, ", layersContext=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public ocm() {
        this.a = "";
        this.b = EmptyList.a;
        this.c = null;
        final int i = 1;
        this.d = a.a(new sls(this) { // from class: icm
            public final /* synthetic */ ocm b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                ocm ocmVar = this.b;
                switch (i3) {
                    case 0:
                        mcm mcmVar = ocm.Companion;
                        break;
                    default:
                        mcm mcmVar2 = ocm.Companion;
                        break;
                }
                return new FormattedText(ocmVar.b);
            }
        });
    }
}
