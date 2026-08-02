package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginFragment;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kbs;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/passport/internal/ui/social/gimap/MailProvider;", "", "", "providerResponse", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "passportSocialConfiguration", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "b", "()Lcom/yandex/passport/api/PassportSocialConfiguration;", "Companion", "com/yandex/passport/internal/ui/social/gimap/q", "GMAIL", "MAILRU", "YAHOO", "RAMBLER", "OUTLOOK", "OTHER", "YANDEX", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MailProvider {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MailProvider[] $VALUES;
    private static final Pattern COMPILED_YANDEX_PATTERN;
    public static final q Companion;
    public static final MailProvider GMAIL;
    public static final MailProvider MAILRU;
    public static final MailProvider OTHER;
    public static final MailProvider OUTLOOK;
    public static final MailProvider RAMBLER;
    private static final String REGEX_USERNAME = "(?:mail\\.)?(yandex-team|ya|yandex)\\.(?:ru|tr|ua|kz|by|com|com\\.tr|com\\.ua|com\\.kz|com\\.by)$";
    public static final MailProvider YAHOO;
    public static final MailProvider YANDEX;
    private final PassportSocialConfiguration passportSocialConfiguration;
    private final String providerResponse;

    static {
        MailProvider mailProvider = new MailProvider("GMAIL", 0, "gmail", PassportSocialConfiguration.MAILISH_GOOGLE);
        GMAIL = mailProvider;
        MailProvider mailProvider2 = new MailProvider("MAILRU", 1, "mailru", PassportSocialConfiguration.MAILISH_MAILRU);
        MAILRU = mailProvider2;
        MailProvider mailProvider3 = new MailProvider("YAHOO", 2, "yahoo", PassportSocialConfiguration.MAILISH_YAHOO);
        YAHOO = mailProvider3;
        MailProvider mailProvider4 = new MailProvider("RAMBLER", 3, "rambler", PassportSocialConfiguration.MAILISH_RAMBLER);
        RAMBLER = mailProvider4;
        MailProvider mailProvider5 = new MailProvider("OUTLOOK", 4, "outlook", PassportSocialConfiguration.MAILISH_OUTLOOK);
        OUTLOOK = mailProvider5;
        MailProvider mailProvider6 = new MailProvider("OTHER", 5, "custom", PassportSocialConfiguration.MAILISH_OTHER);
        OTHER = mailProvider6;
        MailProvider mailProvider7 = new MailProvider("YANDEX", 6, "yandex", null);
        YANDEX = mailProvider7;
        MailProvider[] mailProviderArr = {mailProvider, mailProvider2, mailProvider3, mailProvider4, mailProvider5, mailProvider6, mailProvider7};
        $VALUES = mailProviderArr;
        $ENTRIES = kotlin.enums.a.a(mailProviderArr);
        Companion = new q();
        COMPILED_YANDEX_PATTERN = Pattern.compile(REGEX_USERNAME, 2);
    }

    public MailProvider(String str, int i, String str2, PassportSocialConfiguration passportSocialConfiguration) {
        this.providerResponse = str2;
        this.passportSocialConfiguration = passportSocialConfiguration;
    }

    public static final MailProvider a(String str) {
        Companion.getClass();
        for (MailProvider mailProvider : values()) {
            if (jl40.l(mailProvider.providerResponse, str)) {
                return mailProvider;
            }
        }
        kbs.o("illegal provider response = %s", Arrays.copyOf(new Object[]{str}, 1));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r2.equals("bk.ru") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r2.equals("inbox.ru") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.equals("outlook.com") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        return com.yandex.passport.internal.ui.social.gimap.MailProvider.OUTLOOK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r2.equals("hotmail.com") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2.equals("mail.ru") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        return com.yandex.passport.internal.ui.social.gimap.MailProvider.MAILRU;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("list.ru") == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MailProvider c(String str) {
        String[] strArr;
        Companion.getClass();
        switch (str.hashCode()) {
            case -1760250857:
                break;
            case -1495636431:
                if (str.equals("gmail.com")) {
                    return GMAIL;
                }
                MailPasswordLoginFragment.Companion.getClass();
                strArr = MailPasswordLoginFragment.RAMBLER_DOMAINS;
                if (Arrays.asList(Arrays.copyOf(strArr, strArr.length)).contains(str)) {
                    return RAMBLER;
                }
                if (COMPILED_YANDEX_PATTERN.matcher(str).find()) {
                    return YANDEX;
                }
                return null;
            case -1311829293:
                if (str.equals("yahoo.com")) {
                    return YAHOO;
                }
                MailPasswordLoginFragment.Companion.getClass();
                strArr = MailPasswordLoginFragment.RAMBLER_DOMAINS;
                if (Arrays.asList(Arrays.copyOf(strArr, strArr.length)).contains(str)) {
                }
                break;
            case -369931520:
                break;
            case 64438955:
                break;
            case 93740552:
                break;
            case 181919123:
                break;
            case 830916058:
                break;
            default:
                MailPasswordLoginFragment.Companion.getClass();
                strArr = MailPasswordLoginFragment.RAMBLER_DOMAINS;
                if (Arrays.asList(Arrays.copyOf(strArr, strArr.length)).contains(str)) {
                }
                break;
        }
    }

    public static MailProvider valueOf(String str) {
        return (MailProvider) Enum.valueOf(MailProvider.class, str);
    }

    public static MailProvider[] values() {
        return (MailProvider[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final PassportSocialConfiguration getPassportSocialConfiguration() {
        return this.passportSocialConfiguration;
    }

    /* renamed from: f, reason: from getter */
    public final String getProviderResponse() {
        return this.providerResponse;
    }
}
