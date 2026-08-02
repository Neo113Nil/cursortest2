package com.yandex.go.sharing_personal_goals.data.model;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed", "Lcom/yandex/go/sharing_personal_goals/data/model/z;", "Companion", "Content", "Modal", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/sharing_personal_goals/data/model/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed extends z {
    public static final u Companion = new u();
    public final Content a;
    public final Modal b;

    public SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed(int i, Content content, Modal modal) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = content;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = modal;
        }
    }

    public SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed() {
        this.a = null;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button;", "", "Companion", "com/yandex/go/sharing_personal_goals/data/model/s", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Button {
        public static final t Companion = new t();
        public final FormattedText a;
        public final s b;

        public /* synthetic */ Button(int i, FormattedText formattedText, s sVar) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = new SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink(0);
            } else {
                this.b = sVar;
            }
        }

        public Button() {
            FormattedText formattedText = FormattedText.c;
            SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink = new SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink(0);
            this.a = formattedText;
            this.b = sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Content;", "", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Content {
        public static final v Companion = new v();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;
        public final SharingPersonalGoalsPromoblockBadgeDto d;

        public /* synthetic */ Content(int i, FormattedText formattedText, FormattedText formattedText2, String str, SharingPersonalGoalsPromoblockBadgeDto sharingPersonalGoalsPromoblockBadgeDto) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = sharingPersonalGoalsPromoblockBadgeDto;
            }
        }

        public Content() {
            this.a = FormattedText.c;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal;", "", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Modal {
        public static final w Companion = new w();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;
        public final String d;
        public final Button e;

        public /* synthetic */ Modal(int i, FormattedText formattedText, FormattedText formattedText2, String str, String str2, Button button) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = button;
            }
        }

        public Modal() {
            this.a = FormattedText.c;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }
}
