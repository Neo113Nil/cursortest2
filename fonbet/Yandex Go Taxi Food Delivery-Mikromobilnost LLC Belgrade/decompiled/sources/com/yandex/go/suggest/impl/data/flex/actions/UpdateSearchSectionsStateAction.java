package com.yandex.go.suggest.impl.data.flex.actions;

import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.tse0;
import defpackage.xvz;
import defpackage.yew0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/suggest/impl/data/flex/actions/UpdateSearchSectionsStateAction;", "Lyew0;", "Companion", "QuerySectionInfo", "$serializer", "com/yandex/go/suggest/impl/data/flex/actions/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdateSearchSectionsStateAction extends yew0 {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(18))};
    public final List a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/flex/actions/UpdateSearchSectionsStateAction$QuerySectionInfo;", "", "Companion", "$serializer", "com/yandex/go/suggest/impl/data/flex/actions/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class QuerySectionInfo {
        public static final e Companion = new e();
        public final String a;
        public final boolean b;

        public /* synthetic */ QuerySectionInfo(int i, String str, boolean z) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, UpdateSearchSectionsStateAction$QuerySectionInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuerySectionInfo)) {
                return false;
            }
            QuerySectionInfo querySectionInfo = (QuerySectionInfo) obj;
            return jl40.l(this.a, querySectionInfo.a) && this.b == querySectionInfo.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.k("QuerySectionInfo(sectionId=", this.a, ", hasResults=", this.b, Extension.C_BRAKE);
        }
    }

    public UpdateSearchSectionsStateAction(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, UpdateSearchSectionsStateAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateSearchSectionsStateAction) && jl40.l(this.a, ((UpdateSearchSectionsStateAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("UpdateSearchSectionsStateAction(querySections=", Extension.C_BRAKE, this.a);
    }
}
