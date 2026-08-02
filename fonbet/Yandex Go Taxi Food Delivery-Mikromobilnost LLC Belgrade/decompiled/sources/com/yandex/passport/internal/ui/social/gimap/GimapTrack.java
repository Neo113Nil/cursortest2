package com.yandex.passport.internal.ui.social.gimap;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.cvu0;
import defpackage.jl40;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0001BB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010\rJ\u001d\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\rJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\rJ\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b/\u00100JF\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\rJ\u0010\u00104\u001a\u00020#HÖ\u0001¢\u0006\u0004\b4\u0010)J\u001a\u00107\u001a\u00020\u001d2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010-R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b>\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u00100¨\u0006C"}, d2 = {"Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "Landroid/os/Parcelable;", "", "email", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;", "imapSettings", "smtpSettings", "Lcom/yandex/passport/common/core/Environment;", WebViewActivity.KEY_ENVIRONMENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;Lcom/yandex/passport/common/core/Environment;)V", "getEmailDomain", "()Ljava/lang/String;", "withEmailAndPassword", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "withImapSettings", "(Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;)Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "withSmtpSettings", "(Ljava/lang/String;Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;)Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "minusSmtpSettings", "()Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "Lcom/yandex/passport/internal/h;", "toAuthCredentials", "()Lcom/yandex/passport/internal/h;", "Lcom/yandex/passport/internal/ui/social/gimap/b;", "hint", "applyHint", "(Lcom/yandex/passport/internal/ui/social/gimap/b;)Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "", "isFull", "()Z", "toJson", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "()Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;", "component4", "component5", "()Lcom/yandex/passport/common/core/Environment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;Lcom/yandex/passport/common/core/Environment;)Lcom/yandex/passport/internal/ui/social/gimap/GimapTrack;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getPassword", "Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;", "getImapSettings", "getSmtpSettings", "Lcom/yandex/passport/common/core/Environment;", "getEnvironment", "Companion", "com/yandex/passport/internal/ui/social/gimap/n", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GimapTrack implements Parcelable {
    public static final int $stable = 0;
    public static final String GIMAP_TRACK_EXTRAS = "GIMAP_TRACK_EXTRAS";
    private final String email;
    private final Environment environment;
    private final GimapServerSettings imapSettings;
    private final String password;
    private final GimapServerSettings smtpSettings;
    public static final n Companion = new n();
    public static final Parcelable.Creator<GimapTrack> CREATOR = new Creator();

    public GimapTrack(String str, String str2, GimapServerSettings gimapServerSettings, GimapServerSettings gimapServerSettings2, Environment environment) {
        this.email = str;
        this.password = str2;
        this.imapSettings = gimapServerSettings;
        this.smtpSettings = gimapServerSettings2;
        this.environment = environment;
    }

    public static /* synthetic */ GimapTrack copy$default(GimapTrack gimapTrack, String str, String str2, GimapServerSettings gimapServerSettings, GimapServerSettings gimapServerSettings2, Environment environment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gimapTrack.email;
        }
        if ((i & 2) != 0) {
            str2 = gimapTrack.password;
        }
        if ((i & 4) != 0) {
            gimapServerSettings = gimapTrack.imapSettings;
        }
        if ((i & 8) != 0) {
            gimapServerSettings2 = gimapTrack.smtpSettings;
        }
        if ((i & 16) != 0) {
            environment = gimapTrack.environment;
        }
        Environment environment2 = environment;
        GimapServerSettings gimapServerSettings3 = gimapServerSettings;
        return gimapTrack.copy(str, str2, gimapServerSettings3, gimapServerSettings2, environment2);
    }

    public static final GimapTrack create(String str, Environment environment) {
        Companion.getClass();
        GimapServerSettings.Companion.getClass();
        return new GimapTrack(str, null, m.a(), m.a(), environment);
    }

    public static final String extractEmailDomain(String str) {
        Companion.getClass();
        return n.a(str);
    }

    public static final GimapTrack fromJSON(JSONObject jSONObject) {
        Companion.getClass();
        String string = jSONObject.getString("email");
        m mVar = GimapServerSettings.Companion;
        JSONObject jSONObject2 = jSONObject.getJSONObject("imapSettings");
        mVar.getClass();
        GimapServerSettings b = m.b(jSONObject2);
        GimapServerSettings b2 = m.b(jSONObject.getJSONObject("smtpSettings"));
        com.yandex.passport.common.core.a aVar = Environment.Companion;
        int i = jSONObject.getInt(WebViewActivity.KEY_ENVIRONMENT);
        aVar.getClass();
        return new GimapTrack(string, null, b, b2, com.yandex.passport.common.core.a.a(i));
    }

    public final GimapTrack applyHint(b hint) {
        return copy$default(this, null, null, this.imapSettings.applyHint(hint.a), this.smtpSettings.applyHint(hint.b), null, 19, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component3, reason: from getter */
    public final GimapServerSettings getImapSettings() {
        return this.imapSettings;
    }

    /* renamed from: component4, reason: from getter */
    public final GimapServerSettings getSmtpSettings() {
        return this.smtpSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    public final GimapTrack copy(String email, String password, GimapServerSettings imapSettings, GimapServerSettings smtpSettings, Environment environment) {
        return new GimapTrack(email, password, imapSettings, smtpSettings, environment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GimapTrack)) {
            return false;
        }
        GimapTrack gimapTrack = (GimapTrack) other;
        return jl40.l(this.email, gimapTrack.email) && jl40.l(this.password, gimapTrack.password) && jl40.l(this.imapSettings, gimapTrack.imapSettings) && jl40.l(this.smtpSettings, gimapTrack.smtpSettings) && this.environment == gimapTrack.environment;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getEmailDomain() {
        n nVar = Companion;
        String str = this.email;
        nVar.getClass();
        return n.a(str);
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final GimapServerSettings getImapSettings() {
        return this.imapSettings;
    }

    public final String getPassword() {
        return this.password;
    }

    public final GimapServerSettings getSmtpSettings() {
        return this.smtpSettings;
    }

    public int hashCode() {
        String str = this.email;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        return this.environment.hashCode() + ((this.smtpSettings.hashCode() + ((this.imapSettings.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final boolean isFull() {
        return this.email != null && this.imapSettings.isFull() && this.smtpSettings.isFull();
    }

    public final GimapTrack minusSmtpSettings() {
        GimapServerSettings.Companion.getClass();
        return copy$default(this, null, null, null, m.a(), null, 23, null);
    }

    public final com.yandex.passport.internal.h toAuthCredentials() {
        String str = this.email;
        String login = this.imapSettings.getLogin();
        String password = this.imapSettings.getPassword();
        String host = this.imapSettings.getHost();
        String port = this.imapSettings.getPort();
        boolean booleanValue = this.imapSettings.getSsl().booleanValue();
        String login2 = this.smtpSettings.getLogin();
        String password2 = this.smtpSettings.getPassword();
        String host2 = this.smtpSettings.getHost();
        String port2 = this.smtpSettings.getPort();
        Boolean ssl = this.smtpSettings.getSsl();
        return new com.yandex.passport.internal.h(str, login, password, host, port, booleanValue, login2, password2, host2, port2, ssl != null ? ssl.booleanValue() : true);
    }

    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.email);
        jSONObject.put("imapSettings", this.imapSettings.toJson());
        jSONObject.put("smtpSettings", this.smtpSettings.toJson());
        jSONObject.put(WebViewActivity.KEY_ENVIRONMENT, this.environment.getInteger());
        return jSONObject.toString();
    }

    public String toString() {
        return "GimapTrack(email=" + this.email + ", password=" + this.password + ", imapSettings=" + this.imapSettings + ", smtpSettings=" + this.smtpSettings + ", environment=" + this.environment + ')';
    }

    public final GimapTrack withEmailAndPassword(String email, String password) {
        GimapTrack copy$default = copy$default(this, email, password, null, null, null, 28, null);
        n nVar = Companion;
        String str = this.email;
        nVar.getClass();
        if (!n.a(str).equals(n.a(email))) {
            GimapServerSettings.Companion.getClass();
            copy$default = copy$default(copy$default, null, null, m.a(), m.a(), null, 19, null);
        }
        GimapTrack copy$default2 = !jl40.l(this.password, password) ? copy$default(copy$default, null, null, GimapServerSettings.copy$default(copy$default.imapSettings, null, null, null, null, password, 15, null), GimapServerSettings.copy$default(copy$default.smtpSettings, null, null, null, null, password, 15, null), null, 19, null) : copy$default;
        GimapServerSettings gimapServerSettings = copy$default2.imapSettings;
        String login = gimapServerSettings.getLogin();
        String str2 = login == null ? email : login;
        String password2 = copy$default2.imapSettings.getPassword();
        return copy$default(copy$default2, null, null, GimapServerSettings.copy$default(gimapServerSettings, null, null, null, str2, password2 == null ? password : password2, 7, null), null, null, 27, null);
    }

    public final GimapTrack withImapSettings(GimapServerSettings imapSettings) {
        GimapServerSettings gimapServerSettings = this.smtpSettings;
        String host = gimapServerSettings.getHost();
        if (host == null) {
            String host2 = imapSettings.getHost();
            host = host2 != null ? cvu0.v(host2, "imap", "smtp", true) : null;
        }
        String login = this.smtpSettings.getLogin();
        if (login == null) {
            login = imapSettings.getLogin();
        }
        String str = login;
        String password = this.smtpSettings.getPassword();
        if (password == null) {
            password = imapSettings.getPassword();
        }
        return copy$default(this, null, imapSettings.getPassword(), imapSettings, GimapServerSettings.copy$default(gimapServerSettings, host, null, null, str, password, 6, null), null, 17, null);
    }

    public final GimapTrack withSmtpSettings(String email, GimapServerSettings smtpSettings) {
        if (email == null) {
            email = this.email;
        }
        return copy$default(this, email, null, null, smtpSettings, null, 22, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.email);
        dest.writeString(this.password);
        this.imapSettings.writeToParcel(dest, flags);
        this.smtpSettings.writeToParcel(dest, flags);
        dest.writeParcelable(this.environment, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GimapTrack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GimapTrack createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Parcelable.Creator<GimapServerSettings> creator = GimapServerSettings.CREATOR;
            return new GimapTrack(readString, readString2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (Environment) parcel.readParcelable(GimapTrack.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GimapTrack[] newArray(int i) {
            return new GimapTrack[i];
        }
    }
}
