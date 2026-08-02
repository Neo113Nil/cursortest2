package com.yandex.go.flex.main_screen.presentation.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr;
import defpackage.kz60;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/actions/OpenInfoListAction;", "Lkr;", "Companion", "InfoItem", "$serializer", "com/yandex/go/flex/main_screen/presentation/actions/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OpenInfoListAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(4))};
    public final List a;

    public /* synthetic */ OpenInfoListAction(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenInfoListAction) && jl40.l(this.a, ((OpenInfoListAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("OpenInfoListAction(items=", Extension.C_BRAKE, this.a);
    }

    public OpenInfoListAction() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/actions/OpenInfoListAction$InfoItem;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/presentation/actions/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class InfoItem {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ InfoItem(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoItem)) {
                return false;
            }
            InfoItem infoItem = (InfoItem) obj;
            return jl40.l(this.a, infoItem.a) && jl40.l(this.b, infoItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("InfoItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
        }

        public InfoItem() {
            this.a = "";
            this.b = "";
        }
    }
}
