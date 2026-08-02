package com.yandex.go.scooters.mosru.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateInfoPanelDto;", "", "Companion", "Action", "$serializer", "com/yandex/go/scooters/mosru/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuStateInfoPanelDto {
    public static final f Companion = new f();
    public final FormattedText a;
    public final FormattedText b;
    public final Action c;

    public ScootersMosRuStateInfoPanelDto(int i, FormattedText formattedText, FormattedText formattedText2, Action action) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) != 0) {
            this.c = action;
        } else {
            Action.Companion.getClass();
            this.c = Action.c;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateInfoPanelDto$Action;", "", "Companion", "com/yandex/go/scooters/mosru/data/model/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        public static final e Companion = new e();
        public static final Action c = new Action(0);
        public final String a;
        public final String b;

        public /* synthetic */ Action(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public Action(int i) {
            this.a = "";
            this.b = null;
        }

        public Action() {
            this(0);
        }
    }

    public ScootersMosRuStateInfoPanelDto() {
        FormattedText formattedText = FormattedText.c;
        Action.Companion.getClass();
        this.a = formattedText;
        this.b = null;
        this.c = Action.c;
    }
}
