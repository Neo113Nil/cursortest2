package com.yandex.go.flex.common.actions.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.w0q0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/SelectContactAction;", "Lkr;", "Companion", "ModalConfig", "ModalOptions", "$serializer", "com/yandex/go/flex/common/actions/dto/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectContactAction extends kr {
    public static final e Companion = new e();
    public static final i3y[] e;
    public final JasonStateNodeDto a;
    public final ModalConfig b;
    public final kr c;
    public final kr d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/SelectContactAction$ModalOptions;", "", "ADD_USER_CONTACT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ModalOptions {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ModalOptions[] $VALUES;
        public static final ModalOptions ADD_USER_CONTACT;

        static {
            ModalOptions modalOptions = new ModalOptions("ADD_USER_CONTACT", 0);
            ADD_USER_CONTACT = modalOptions;
            ModalOptions[] modalOptionsArr = {modalOptions};
            $VALUES = modalOptionsArr;
            $ENTRIES = kotlin.enums.a.a(modalOptionsArr);
        }

        public static ModalOptions valueOf(String str) {
            return (ModalOptions) Enum.valueOf(ModalOptions.class, str);
        }

        public static ModalOptions[] values() {
            return (ModalOptions[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new w0q0(18)), kotlin.a.b(lazyThreadSafetyMode, new w0q0(19))};
    }

    public /* synthetic */ SelectContactAction(int i, JasonStateNodeDto jasonStateNodeDto, ModalConfig modalConfig, kr krVar, kr krVar2) {
        this.a = (i & 1) == 0 ? new JasonStateNodeDto(0) : jasonStateNodeDto;
        if ((i & 2) == 0) {
            this.b = new ModalConfig(0);
        } else {
            this.b = modalConfig;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = krVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = krVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/SelectContactAction$ModalConfig;", "", "Companion", "$serializer", "com/yandex/go/flex/common/actions/dto/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ModalConfig {
        public static final f Companion = new f();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(20))};
        public final String a;
        public final String b;
        public final List c;

        public /* synthetic */ ModalConfig(int i, String str, String str2, List list) {
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
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = list;
            }
        }

        public ModalConfig(int i) {
            this.a = "";
            this.b = "";
            this.c = null;
        }

        public ModalConfig() {
            this(0);
        }
    }

    public SelectContactAction() {
        JasonStateNodeDto jasonStateNodeDto = new JasonStateNodeDto(0);
        ModalConfig modalConfig = new ModalConfig(0);
        this.a = jasonStateNodeDto;
        this.b = modalConfig;
        this.c = null;
        this.d = null;
    }
}
