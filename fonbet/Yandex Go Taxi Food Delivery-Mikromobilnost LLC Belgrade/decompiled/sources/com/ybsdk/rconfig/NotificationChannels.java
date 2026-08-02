package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.n;
import defpackage.tse0;
import defpackage.u1g0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/NotificationChannels;", "", "", "Lcom/ybsdk/rconfig/NotificationChannels$YbNotificationChannel;", "channels", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/ybsdk/rconfig/NotificationChannels;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChannels", "YbNotificationChannel", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NotificationChannels {

    @Json(name = "channels")
    private final List<YbNotificationChannel> channels;

    public NotificationChannels(List<YbNotificationChannel> list) {
        this.channels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationChannels copy$default(NotificationChannels notificationChannels, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notificationChannels.channels;
        }
        return notificationChannels.copy(list);
    }

    public final List<YbNotificationChannel> component1() {
        return this.channels;
    }

    public final NotificationChannels copy(List<YbNotificationChannel> channels) {
        return new NotificationChannels(channels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationChannels) && jl40.l(this.channels, ((NotificationChannels) other).channels);
    }

    public final List<YbNotificationChannel> getChannels() {
        return this.channels;
    }

    public int hashCode() {
        return this.channels.hashCode();
    }

    public String toString() {
        return tse0.k("NotificationChannels(channels=", Extension.C_BRAKE, this.channels);
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/rconfig/NotificationChannels$YbNotificationChannel;", "", "", "id", "Lcom/ybsdk/core/utils/text/Text;", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "priority", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;I)V", "Lu1g0;", "toFeatureNotificationChanel", "()Lu1g0;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/utils/text/Text;", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;I)Lcom/ybsdk/rconfig/NotificationChannels$YbNotificationChannel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/ybsdk/core/utils/text/Text;", "getName", "getDescription", CA20Status.STATUS_USER_I, "getPriority", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class YbNotificationChannel {

        @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
        private final String description;

        @Json(name = "id")
        private final String id;

        @Json(name = "name")
        private final Text name;

        @Json(name = "priority")
        private final int priority;

        public YbNotificationChannel(String str, Text text, String str2, int i) {
            this.id = str;
            this.name = text;
            this.description = str2;
            this.priority = i;
        }

        public static /* synthetic */ YbNotificationChannel copy$default(YbNotificationChannel ybNotificationChannel, String str, Text text, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = ybNotificationChannel.id;
            }
            if ((i2 & 2) != 0) {
                text = ybNotificationChannel.name;
            }
            if ((i2 & 4) != 0) {
                str2 = ybNotificationChannel.description;
            }
            if ((i2 & 8) != 0) {
                i = ybNotificationChannel.priority;
            }
            return ybNotificationChannel.copy(str, text, str2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Text getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public final YbNotificationChannel copy(String id, Text name, String description, int priority) {
            return new YbNotificationChannel(id, name, description, priority);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YbNotificationChannel)) {
                return false;
            }
            YbNotificationChannel ybNotificationChannel = (YbNotificationChannel) other;
            return jl40.l(this.id, ybNotificationChannel.id) && jl40.l(this.name, ybNotificationChannel.name) && jl40.l(this.description, ybNotificationChannel.description) && this.priority == ybNotificationChannel.priority;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getId() {
            return this.id;
        }

        public final Text getName() {
            return this.name;
        }

        public final int getPriority() {
            return this.priority;
        }

        public int hashCode() {
            int c = n.c(this.name, this.id.hashCode() * 31, 31);
            String str = this.description;
            return Integer.hashCode(this.priority) + ((c + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final u1g0 toFeatureNotificationChanel() {
            return new u1g0(this.id, this.name, this.description, this.priority);
        }

        public String toString() {
            return "YbNotificationChannel(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", priority=" + this.priority + Extension.C_BRAKE;
        }

        public /* synthetic */ YbNotificationChannel(String str, Text text, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, text, (i2 & 4) != 0 ? null : str2, i);
        }
    }
}
