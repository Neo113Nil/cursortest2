package com.yandex.go.safety.center.contacts;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import defpackage.k4o;
import defpackage.l050;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView;", "Ll050;", "UiMode", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SafetyCenterContactsMvpView extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;", "", "EMPTY", "NOT_FILLED", "FILLED", "EDIT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class UiMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UiMode[] $VALUES;
        public static final UiMode EDIT;
        public static final UiMode EMPTY;
        public static final UiMode FILLED;
        public static final UiMode NOT_FILLED;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView.UiMode.EDIT", "Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class EDIT extends UiMode {
            public EDIT() {
                super("EDIT", 3);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView.UiMode.EMPTY", "Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class EMPTY extends UiMode {
            public EMPTY() {
                super("EMPTY", 0);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView.UiMode.FILLED", "Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class FILLED extends UiMode {
            public FILLED() {
                super("FILLED", 2);
            }

            @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView.UiMode
            public final boolean a() {
                return true;
            }

            @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView.UiMode
            public final boolean c() {
                return true;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView.UiMode.NOT_FILLED", "Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class NOT_FILLED extends UiMode {
            public NOT_FILLED() {
                super("NOT_FILLED", 1);
            }

            @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView.UiMode
            public final boolean a() {
                return true;
            }

            @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView.UiMode
            public final boolean b() {
                return true;
            }

            @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView.UiMode
            public final boolean c() {
                return true;
            }

            @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView.UiMode
            public final boolean f() {
                return true;
            }
        }

        static {
            EMPTY empty = new EMPTY();
            EMPTY = empty;
            NOT_FILLED not_filled = new NOT_FILLED();
            NOT_FILLED = not_filled;
            FILLED filled = new FILLED();
            FILLED = filled;
            EDIT edit = new EDIT();
            EDIT = edit;
            UiMode[] uiModeArr = {empty, not_filled, filled, edit};
            $VALUES = uiModeArr;
            $ENTRIES = kotlin.enums.a.a(uiModeArr);
        }

        public static UiMode valueOf(String str) {
            return (UiMode) Enum.valueOf(UiMode.class, str);
        }

        public static UiMode[] values() {
            return (UiMode[]) $VALUES.clone();
        }

        public boolean a() {
            return this instanceof EDIT;
        }

        public boolean b() {
            return this instanceof FILLED;
        }

        public boolean c() {
            return this instanceof EMPTY;
        }

        public boolean f() {
            return this instanceof FILLED;
        }
    }

    void resetShareButton();

    void setContacts(List list);

    void setMode(UiMode uiMode);

    void setShareDescription(SafetyCenterExperiment.L10nKey l10nKey);

    void setShareStatus(ShareStatus shareStatus);

    void showError(String str);

    void showLoading(boolean z);
}
