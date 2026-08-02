package com.yandex.go.slot.dto;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.oqs0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/dto/SlotItemActionDto$OpenSettingsModal", "Lcom/yandex/go/slot/dto/b2;", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/slot/dto/p1", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemActionDto$OpenSettingsModal extends b2 {
    public static final p1 Companion = new p1();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(21)), null};
    public final n7v a;
    public final String b;
    public final List c;
    public final Button d;

    public SlotItemActionDto$OpenSettingsModal(int i, n7v n7vVar, String str, List list, Button button) {
        this.a = (i & 1) == 0 ? null : n7vVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = new Button(0);
        } else {
            this.d = button;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemActionDto$OpenSettingsModal)) {
            return false;
        }
        SlotItemActionDto$OpenSettingsModal slotItemActionDto$OpenSettingsModal = (SlotItemActionDto$OpenSettingsModal) obj;
        return jl40.l(this.a, slotItemActionDto$OpenSettingsModal.a) && jl40.l(this.b, slotItemActionDto$OpenSettingsModal.b) && jl40.l(this.c, slotItemActionDto$OpenSettingsModal.c) && jl40.l(this.d, slotItemActionDto$OpenSettingsModal.d);
    }

    public final int hashCode() {
        n7v n7vVar = this.a;
        return this.d.hashCode() + unr0.c(unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "OpenSettingsModal(icon=" + this.a + ", title=" + this.b + ", content=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemActionDto$OpenSettingsModal$Button;", "", "Companion", "$serializer", "com/yandex/go/slot/dto/o1", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Button {
        public static final o1 Companion = new o1();
        public final String a;
        public final b2 b;

        public /* synthetic */ Button(int i, String str, b2 b2Var) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = b2Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return jl40.l(this.a, button.a) && jl40.l(this.b, button.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            b2 b2Var = this.b;
            return hashCode + (b2Var == null ? 0 : b2Var.hashCode());
        }

        public final String toString() {
            return "Button(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
        }

        public Button(int i) {
            this.a = "";
            this.b = null;
        }

        public Button() {
            this(0);
        }
    }

    public SlotItemActionDto$OpenSettingsModal() {
        Button button = new Button(0);
        this.a = null;
        this.b = "";
        this.c = EmptyList.a;
        this.d = button;
    }
}
