package com.vkontakte.android.data;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.PrivacySetting;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import xsna.e43;
import xsna.g620;
import xsna.qwe;

/* compiled from: PrivacyRulesLocal.kt */
/* loaded from: classes7.dex */
public final class PrivacyRulesLocal {
    public static final PrivacySetting.PrivacyRule a = new PredefinedSetClipsLocal();

    /* compiled from: PrivacyRulesLocal.kt */
    public static final class PredefinedSetClipsLocal extends PrivacySetting.PrivacyRule {
        public static final Serializer.c<PredefinedSetClipsLocal> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PredefinedSetClipsLocal> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PredefinedSetClipsLocal a(Serializer serializer) {
                return new PredefinedSetClipsLocal();
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PredefinedSetClipsLocal[i];
            }
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Ab() {
            qwe privacy = g620.f().getPrivacy();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return privacy.g(context);
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Bb() {
            qwe privacy = g620.f().getPrivacy();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return privacy.g(context);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof PrivacySetting.PrivacyRule) {
                return new HashSet(zb()).equals(new HashSet(((PrivacySetting.PrivacyRule) obj).zb()));
            }
            return false;
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final List<String> zb() {
            return Collections.singletonList(g620.f().getPrivacy().i());
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
