package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/chargers/data/model/Action$Info", "Lcom/yandex/go/chargers/data/model/e;", "Companion", "Screen", "$serializer", "com/yandex/go/chargers/data/model/a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Action$Info extends e {
    public static final a Companion = new a();
    public final Screen a;

    public Action$Info(int i, Screen screen) {
        if ((i & 1) == 0) {
            this.a = new Screen(0);
        } else {
            this.a = screen;
        }
    }

    public Action$Info() {
        this.a = new Screen(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/data/model/Action$Info$Screen;", "", "Companion", "$serializer", "com/yandex/go/chargers/data/model/b", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Screen {
        public static final b Companion = new b();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;

        public /* synthetic */ Screen(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public Screen() {
            this(0);
        }

        public Screen(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = null;
        }
    }
}
