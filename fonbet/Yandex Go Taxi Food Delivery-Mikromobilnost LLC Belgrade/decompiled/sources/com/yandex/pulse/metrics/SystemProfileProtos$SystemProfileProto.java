package com.yandex.pulse.metrics;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.dqw;
import defpackage.eac;
import defpackage.fqw;
import defpackage.jqw;
import defpackage.kqw;
import defpackage.lqw;
import defpackage.o5w;
import defpackage.of90;
import defpackage.oqw;
import defpackage.oxs;
import defpackage.p3x0;
import defpackage.p9;
import defpackage.pyo;
import defpackage.q3x0;
import defpackage.w511;
import defpackage.zt10;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class SystemProfileProtos$SystemProfileProto extends GeneratedMessageLite implements zt10 {
    public static final int ACCESSIBILITY_STATE_FIELD_NUMBER = 49;
    public static final int ANTIVIRUS_PRODUCT_FIELD_NUMBER = 23;
    public static final int APPLICATION_LOCALE_FIELD_NUMBER = 4;
    public static final int APP_PACKAGE_NAME_ALLOWLIST_FILTER_FIELD_NUMBER = 42;
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 26;
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final int BRAND_CODE_FIELD_NUMBER = 12;
    public static final int BUILD_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int CHANNEL_FIELD_NUMBER = 10;
    public static final int CHROME_COMPONENT_FIELD_NUMBER = 24;
    public static final int CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER = 33;
    public static final int CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER = 43;
    public static final int CLIENT_UUID_FIELD_NUMBER = 34;
    public static final int CLONED_INSTALL_INFO_FIELD_NUMBER = 39;
    public static final int COMMAND_LINE_KEY_HASH_FIELD_NUMBER = 38;
    private static final SystemProfileProtos$SystemProfileProto DEFAULT_INSTANCE;
    public static final int DEMO_MODE_DIMENSIONS_FIELD_NUMBER = 41;
    public static final int EXTERNAL_ACCESS_POINT_FIELD_NUMBER = 15;
    public static final int EXTERNAL_AUDIO_VIDEO_DEVICE_FIELD_NUMBER = 14;
    public static final int FG_BG_ID_FIELD_NUMBER = 48;
    public static final int FIELD_TRIAL_FIELD_NUMBER = 9;
    public static final int GOOGLE_UPDATE_FIELD_NUMBER = 11;
    public static final int HARDWARE_FIELD_NUMBER = 6;
    public static final int INSTALLER_PACKAGE_FIELD_NUMBER = 35;
    public static final int INSTALL_DATE_FIELD_NUMBER = 16;
    public static final int IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER = 36;
    public static final int IS_INSTRUMENTED_BUILD_FIELD_NUMBER = 20;
    public static final int LINKED_ANDROID_PHONE_DATA_FIELD_NUMBER = 29;
    public static final int LOG_WRITTEN_BY_APP_VERSION_FIELD_NUMBER = 40;
    public static final int LOW_ENTROPY_SOURCE_FIELD_NUMBER = 31;
    public static final int LTS_CHANNEL_FIELD_NUMBER = 45;
    public static final int METRICS_FILTERING_STATUS_FIELD_NUMBER = 44;
    public static final int MULTI_PROFILE_USER_COUNT_FIELD_NUMBER = 17;
    public static final int NETWORK_FIELD_NUMBER = 13;
    public static final int OCCUPIED_EXTENSION_BUCKET_FIELD_NUMBER = 18;
    public static final int OFFSTORE_EXTENSIONS_STATE_FIELD_NUMBER = 19;
    public static final int OLD_LOW_ENTROPY_SOURCE_FIELD_NUMBER = 32;
    public static final int OS_FIELD_NUMBER = 5;
    private static volatile of90 PARSER = null;
    public static final int PSEUDO_LOW_ENTROPY_SOURCE_FIELD_NUMBER = 37;
    public static final int SEED_HAS_ACTIVE_LIMITED_LAYER_FIELD_NUMBER = 50;
    public static final int SESSION_HASH_FIELD_NUMBER = 46;
    public static final int STABILITY_FIELD_NUMBER = 8;
    public static final int TPM_IDENTIFIER_FIELD_NUMBER = 47;
    public static final int UMA_DEFAULT_STATE_FIELD_NUMBER = 22;
    public static final int UMA_ENABLED_DATE_FIELD_NUMBER = 3;
    public static final int VARIATIONS_SEED_VERSION_FIELD_NUMBER = 28;
    public static final int YA_FIELD_NUMBER = 1000;
    private AccessibilityState accessibilityState_;
    private int appPackageNameAllowlistFilter_;
    private int bitField0_;
    private int bitField1_;
    private long buildTimestamp_;
    private int channel_;
    private boolean clientIdWasUsedForTrialAssignment_;
    private int clientSideSamplingStatus_;
    private c clonedInstallInfo_;
    private DemoModeDimensions demoModeDimensions_;
    private d externalAccessPoint_;
    private int fgBgId_;
    private GoogleUpdate googleUpdate_;
    private Hardware hardware_;
    private long installDate_;
    private int installerPackage_;
    private boolean isExtendedStableChannel_;
    private boolean isInstrumentedBuild_;
    private f linkedAndroidPhoneData_;
    private int lowEntropySource_;
    private int ltsChannel_;
    private int metricsFilteringStatus_;
    private int multiProfileUserCount_;
    private Network network_;
    private int offstoreExtensionsState_;
    private int oldLowEntropySource_;
    private OS os_;
    private int pseudoLowEntropySource_;
    private boolean seedHasActiveLimitedLayer_;
    private long sessionHash_;
    private g stability_;
    private h tpmIdentifier_;
    private int umaDefaultState_;
    private long umaEnabledDate_;
    private Yandex ya_;
    private int commandLineKeyHashMemoizedSerializedSize = -1;
    private String appVersion_ = "";
    private String logWrittenByAppVersion_ = "";
    private String brandCode_ = "";
    private String applicationLocale_ = "";
    private jqw commandLineKeyHash_ = GeneratedMessageLite.emptyIntList();
    private oqw fieldTrial_ = GeneratedMessageLite.emptyProtobufList();
    private String variationsSeedVersion_ = "";
    private String clientUuid_ = "";
    private oqw externalAudioVideoDevice_ = GeneratedMessageLite.emptyProtobufList();
    private jqw occupiedExtensionBucket_ = GeneratedMessageLite.emptyIntList();
    private oqw antivirusProduct_ = GeneratedMessageLite.emptyProtobufList();
    private oqw chromeComponent_ = GeneratedMessageLite.emptyProtobufList();
    private String appPackageName_ = "";

    public enum AntiVirusState implements dqw {
        STATE_ON(0),
        STATE_OFF(1),
        STATE_SNOOZED(2),
        STATE_EXPIRED(3);

        public static final int STATE_EXPIRED_VALUE = 3;
        public static final int STATE_OFF_VALUE = 1;
        public static final int STATE_ON_VALUE = 0;
        public static final int STATE_SNOOZED_VALUE = 2;
        private static final fqw internalValueMap = new n();
        private final int value;

        AntiVirusState(int i) {
            this.value = i;
        }

        public static AntiVirusState a(int i) {
            if (i == 0) {
                return STATE_ON;
            }
            if (i == 1) {
                return STATE_OFF;
            }
            if (i == 2) {
                return STATE_SNOOZED;
            }
            if (i != 3) {
                return null;
            }
            return STATE_EXPIRED;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum AppPackageNameAllowlistFilter implements dqw {
        SERVER_SIDE_FILTER_UNSPECIFIED(0),
        SERVER_SIDE_FILTER_REQUIRED(1),
        NO_SERVER_SIDE_FILTER_REQUIRED_FOR_SYSTEM_APPS(3);

        public static final int NO_SERVER_SIDE_FILTER_REQUIRED_FOR_SYSTEM_APPS_VALUE = 3;
        public static final int SERVER_SIDE_FILTER_REQUIRED_VALUE = 1;
        public static final int SERVER_SIDE_FILTER_UNSPECIFIED_VALUE = 0;
        private static final fqw internalValueMap = new p();
        private final int value;

        AppPackageNameAllowlistFilter(int i) {
            this.value = i;
        }

        public static AppPackageNameAllowlistFilter a(int i) {
            if (i == 0) {
                return SERVER_SIDE_FILTER_UNSPECIFIED;
            }
            if (i == 1) {
                return SERVER_SIDE_FILTER_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return NO_SERVER_SIDE_FILTER_REQUIRED_FOR_SYSTEM_APPS;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Channel implements dqw {
        CHANNEL_UNKNOWN(0),
        CHANNEL_CANARY(1),
        CHANNEL_DEV(2),
        CHANNEL_BETA(3),
        CHANNEL_STABLE(4),
        CHANNEL_CORPORATE(100),
        CHANNEL_CLOUD(101);

        public static final int CHANNEL_BETA_VALUE = 3;
        public static final int CHANNEL_CANARY_VALUE = 1;
        public static final int CHANNEL_CLOUD_VALUE = 101;
        public static final int CHANNEL_CORPORATE_VALUE = 100;
        public static final int CHANNEL_DEV_VALUE = 2;
        public static final int CHANNEL_STABLE_VALUE = 4;
        public static final int CHANNEL_UNKNOWN_VALUE = 0;
        private static final fqw internalValueMap = new s();
        private final int value;

        Channel(int i) {
            this.value = i;
        }

        public static Channel a(int i) {
            if (i == 0) {
                return CHANNEL_UNKNOWN;
            }
            if (i == 1) {
                return CHANNEL_CANARY;
            }
            if (i == 2) {
                return CHANNEL_DEV;
            }
            if (i == 3) {
                return CHANNEL_BETA;
            }
            if (i == 4) {
                return CHANNEL_STABLE;
            }
            if (i == 100) {
                return CHANNEL_CORPORATE;
            }
            if (i != 101) {
                return null;
            }
            return CHANNEL_CLOUD;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum ClientSideSamplingStatus implements dqw {
        SAMPLING_UNKNOWN(0),
        SAMPLING_APPLIED(1),
        SAMPLING_NOT_APPLIED(2);

        public static final int SAMPLING_APPLIED_VALUE = 1;
        public static final int SAMPLING_NOT_APPLIED_VALUE = 2;
        public static final int SAMPLING_UNKNOWN_VALUE = 0;
        private static final fqw internalValueMap = new w();
        private final int value;

        ClientSideSamplingStatus(int i) {
            this.value = i;
        }

        public static ClientSideSamplingStatus a(int i) {
            if (i == 0) {
                return SAMPLING_UNKNOWN;
            }
            if (i == 1) {
                return SAMPLING_APPLIED;
            }
            if (i != 2) {
                return null;
            }
            return SAMPLING_NOT_APPLIED;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum ComponentId implements dqw {
        UNKNOWN(1),
        FILE_TYPE_POLICIES(2),
        ORIGIN_TRIALS(3),
        PEPPER_FLASH(4),
        PEPPER_FLASH_CHROMEOS(5),
        PNACL(6),
        RECOVERY(7),
        SSL_ERROR_ASSISTANT(8),
        STH_SET(9),
        CRL_SET(10),
        SUBRESOURCE_FILTER(11),
        SW_REPORTER(12),
        WIDEVINE_CDM(13),
        EPSON_INKJET_PRINTER_ESCPR(14),
        CROS_TERMINA(15),
        STAR_CUPS_DRIVER(16),
        SPEECH_SYNTHESIS_SV_SE(17),
        OPTIMIZATION_HINTS(18),
        DOWNLOADABLE_STRINGS(19),
        VR_ASSETS(20),
        RTANALYTICS_LIGHT(21),
        RTANALYTICS_FULL(22),
        CELLULAR(23),
        DEMO_MODE_RESOURCES(24),
        ON_DEVICE_HEAD_SUGGEST(25),
        CROS_SMART_DIM(26),
        ZXCVBN_DATA(27),
        AUTOFILL_REGEX_CONSTANTS(28),
        MEDIA_FOUNDATION_WIDEVINE_CDM(30),
        CROWD_DENY(31),
        PEPPER_FLASH_INSTALLER(1001),
        HIPS_INSTALLER(1002),
        SPA_PRESET_ASA(1003),
        SPA_PRESET_DIG(1004),
        APP_PROVISIONING(32),
        AUTOFILL_STATES(33),
        CLIENT_SIDE_PHISHING(34),
        COMMERCE_HEURISTICS(35),
        CROW_DOMAIN_LIST(36),
        DEMO_MODE_APP(37),
        DESKTOP_SCREENSHOT_EDITOR(38),
        DESKTOP_SHARING_HUB(39),
        FIRST_PARTY_SETS(40),
        HYPHENATION(41),
        INTERVENTION_POLICY_DATABASE(42),
        LACROS_DOGFOOD_BETA(43),
        LACROS_DOGFOOD_CANARY(44),
        LACROS_DOGFOOD_DEV(45),
        LACROS_DOGFOOD_STABLE(46),
        MEI_PRELOAD(47),
        PKI_METADATA(48),
        REAL_TIME_URL_CHECKS_ALLOWLIST(49),
        RECOVERY_IMPROVED(50),
        SAFETY_TIPS(51),
        SCREEN_AI(52),
        SMART_DIM(53),
        SODA(54),
        SODA_DE_DE(55),
        SODA_EN_US(56),
        SODA_ES_ES(57),
        SODA_FR_FR(58),
        SODA_IT_IT(59),
        SODA_JA_JP(60),
        THIRD_PARTY_MODULE_LIST(61),
        TRUST_TOKEN_KEY_COMMITMENTS(62),
        THIRD_PARTY_COOKIE_DEPRECATION_METADATA(63),
        GROWTH_CAMPAIGNS(64),
        MASKED_DOMAIN_LIST(65),
        AMOUNT_EXTRACTION_HEURISTIC_REGEXES(66),
        FINGERPRINTING_PROTECTION_FILTER_RULES(67),
        TRANSLATE_KIT(68);

        public static final int AMOUNT_EXTRACTION_HEURISTIC_REGEXES_VALUE = 66;
        public static final int APP_PROVISIONING_VALUE = 32;
        public static final int AUTOFILL_REGEX_CONSTANTS_VALUE = 28;
        public static final int AUTOFILL_STATES_VALUE = 33;
        public static final int CELLULAR_VALUE = 23;
        public static final int CLIENT_SIDE_PHISHING_VALUE = 34;
        public static final int COMMERCE_HEURISTICS_VALUE = 35;
        public static final int CRL_SET_VALUE = 10;
        public static final int CROS_SMART_DIM_VALUE = 26;
        public static final int CROS_TERMINA_VALUE = 15;
        public static final int CROWD_DENY_VALUE = 31;
        public static final int CROW_DOMAIN_LIST_VALUE = 36;
        public static final int DEMO_MODE_APP_VALUE = 37;
        public static final int DEMO_MODE_RESOURCES_VALUE = 24;
        public static final int DESKTOP_SCREENSHOT_EDITOR_VALUE = 38;
        public static final int DESKTOP_SHARING_HUB_VALUE = 39;
        public static final int DOWNLOADABLE_STRINGS_VALUE = 19;
        public static final int EPSON_INKJET_PRINTER_ESCPR_VALUE = 14;
        public static final int FILE_TYPE_POLICIES_VALUE = 2;
        public static final int FINGERPRINTING_PROTECTION_FILTER_RULES_VALUE = 67;
        public static final int FIRST_PARTY_SETS_VALUE = 40;
        public static final int GROWTH_CAMPAIGNS_VALUE = 64;
        public static final int HIPS_INSTALLER_VALUE = 1002;
        public static final int HYPHENATION_VALUE = 41;
        public static final int INTERVENTION_POLICY_DATABASE_VALUE = 42;
        public static final int LACROS_DOGFOOD_BETA_VALUE = 43;
        public static final int LACROS_DOGFOOD_CANARY_VALUE = 44;
        public static final int LACROS_DOGFOOD_DEV_VALUE = 45;
        public static final int LACROS_DOGFOOD_STABLE_VALUE = 46;
        public static final int MASKED_DOMAIN_LIST_VALUE = 65;
        public static final int MEDIA_FOUNDATION_WIDEVINE_CDM_VALUE = 30;
        public static final int MEI_PRELOAD_VALUE = 47;
        public static final int ON_DEVICE_HEAD_SUGGEST_VALUE = 25;
        public static final int OPTIMIZATION_HINTS_VALUE = 18;
        public static final int ORIGIN_TRIALS_VALUE = 3;
        public static final int PEPPER_FLASH_CHROMEOS_VALUE = 5;
        public static final int PEPPER_FLASH_INSTALLER_VALUE = 1001;
        public static final int PEPPER_FLASH_VALUE = 4;
        public static final int PKI_METADATA_VALUE = 48;
        public static final int PNACL_VALUE = 6;
        public static final int REAL_TIME_URL_CHECKS_ALLOWLIST_VALUE = 49;
        public static final int RECOVERY_IMPROVED_VALUE = 50;
        public static final int RECOVERY_VALUE = 7;
        public static final int RTANALYTICS_FULL_VALUE = 22;
        public static final int RTANALYTICS_LIGHT_VALUE = 21;
        public static final int SAFETY_TIPS_VALUE = 51;
        public static final int SCREEN_AI_VALUE = 52;
        public static final int SMART_DIM_VALUE = 53;
        public static final int SODA_DE_DE_VALUE = 55;
        public static final int SODA_EN_US_VALUE = 56;
        public static final int SODA_ES_ES_VALUE = 57;
        public static final int SODA_FR_FR_VALUE = 58;
        public static final int SODA_IT_IT_VALUE = 59;
        public static final int SODA_JA_JP_VALUE = 60;
        public static final int SODA_VALUE = 54;
        public static final int SPA_PRESET_ASA_VALUE = 1003;
        public static final int SPA_PRESET_DIG_VALUE = 1004;
        public static final int SPEECH_SYNTHESIS_SV_SE_VALUE = 17;
        public static final int SSL_ERROR_ASSISTANT_VALUE = 8;
        public static final int STAR_CUPS_DRIVER_VALUE = 16;
        public static final int STH_SET_VALUE = 9;
        public static final int SUBRESOURCE_FILTER_VALUE = 11;
        public static final int SW_REPORTER_VALUE = 12;
        public static final int THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE = 63;
        public static final int THIRD_PARTY_MODULE_LIST_VALUE = 61;
        public static final int TRANSLATE_KIT_VALUE = 68;
        public static final int TRUST_TOKEN_KEY_COMMITMENTS_VALUE = 62;
        public static final int UNKNOWN_VALUE = 1;
        public static final int VR_ASSETS_VALUE = 20;
        public static final int WIDEVINE_CDM_VALUE = 13;
        public static final int ZXCVBN_DATA_VALUE = 27;
        private static final fqw internalValueMap = new z();
        private final int value;

        ComponentId(int i) {
            this.value = i;
        }

        public static ComponentId a(int i) {
            switch (i) {
                case 1:
                    return UNKNOWN;
                case 2:
                    return FILE_TYPE_POLICIES;
                case 3:
                    return ORIGIN_TRIALS;
                case 4:
                    return PEPPER_FLASH;
                case 5:
                    return PEPPER_FLASH_CHROMEOS;
                case 6:
                    return PNACL;
                case 7:
                    return RECOVERY;
                case 8:
                    return SSL_ERROR_ASSISTANT;
                case 9:
                    return STH_SET;
                case 10:
                    return CRL_SET;
                case 11:
                    return SUBRESOURCE_FILTER;
                case 12:
                    return SW_REPORTER;
                case 13:
                    return WIDEVINE_CDM;
                case 14:
                    return EPSON_INKJET_PRINTER_ESCPR;
                case 15:
                    return CROS_TERMINA;
                case 16:
                    return STAR_CUPS_DRIVER;
                case 17:
                    return SPEECH_SYNTHESIS_SV_SE;
                case 18:
                    return OPTIMIZATION_HINTS;
                case 19:
                    return DOWNLOADABLE_STRINGS;
                case 20:
                    return VR_ASSETS;
                case 21:
                    return RTANALYTICS_LIGHT;
                case 22:
                    return RTANALYTICS_FULL;
                case 23:
                    return CELLULAR;
                case 24:
                    return DEMO_MODE_RESOURCES;
                case 25:
                    return ON_DEVICE_HEAD_SUGGEST;
                case 26:
                    return CROS_SMART_DIM;
                case 27:
                    return ZXCVBN_DATA;
                case 28:
                    return AUTOFILL_REGEX_CONSTANTS;
                default:
                    switch (i) {
                        case 30:
                            return MEDIA_FOUNDATION_WIDEVINE_CDM;
                        case 31:
                            return CROWD_DENY;
                        case 32:
                            return APP_PROVISIONING;
                        case 33:
                            return AUTOFILL_STATES;
                        case 34:
                            return CLIENT_SIDE_PHISHING;
                        case 35:
                            return COMMERCE_HEURISTICS;
                        case 36:
                            return CROW_DOMAIN_LIST;
                        case 37:
                            return DEMO_MODE_APP;
                        case 38:
                            return DESKTOP_SCREENSHOT_EDITOR;
                        case 39:
                            return DESKTOP_SHARING_HUB;
                        case 40:
                            return FIRST_PARTY_SETS;
                        case 41:
                            return HYPHENATION;
                        case 42:
                            return INTERVENTION_POLICY_DATABASE;
                        case 43:
                            return LACROS_DOGFOOD_BETA;
                        case 44:
                            return LACROS_DOGFOOD_CANARY;
                        case 45:
                            return LACROS_DOGFOOD_DEV;
                        case 46:
                            return LACROS_DOGFOOD_STABLE;
                        case 47:
                            return MEI_PRELOAD;
                        case 48:
                            return PKI_METADATA;
                        case 49:
                            return REAL_TIME_URL_CHECKS_ALLOWLIST;
                        case 50:
                            return RECOVERY_IMPROVED;
                        case SAFETY_TIPS_VALUE:
                            return SAFETY_TIPS;
                        case 52:
                            return SCREEN_AI;
                        case 53:
                            return SMART_DIM;
                        case 54:
                            return SODA;
                        case SODA_DE_DE_VALUE:
                            return SODA_DE_DE;
                        case 56:
                            return SODA_EN_US;
                        case SODA_ES_ES_VALUE:
                            return SODA_ES_ES;
                        case 58:
                            return SODA_FR_FR;
                        case 59:
                            return SODA_IT_IT;
                        case 60:
                            return SODA_JA_JP;
                        case 61:
                            return THIRD_PARTY_MODULE_LIST;
                        case 62:
                            return TRUST_TOKEN_KEY_COMMITMENTS;
                        case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                            return THIRD_PARTY_COOKIE_DEPRECATION_METADATA;
                        case 64:
                            return GROWTH_CAMPAIGNS;
                        case 65:
                            return MASKED_DOMAIN_LIST;
                        case 66:
                            return AMOUNT_EXTRACTION_HEURISTIC_REGEXES;
                        case 67:
                            return FINGERPRINTING_PROTECTION_FILTER_RULES;
                        case TRANSLATE_KIT_VALUE:
                            return TRANSLATE_KIT;
                        default:
                            switch (i) {
                                case 1001:
                                    return PEPPER_FLASH_INSTALLER;
                                case 1002:
                                    return HIPS_INSTALLER;
                                case 1003:
                                    return SPA_PRESET_ASA;
                                case 1004:
                                    return SPA_PRESET_DIG;
                                default:
                                    return null;
                            }
                    }
            }
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum ExtensionsState implements dqw {
        NO_EXTENSIONS(0),
        NO_OFFSTORE_VERIFIED(1),
        NO_OFFSTORE_UNVERIFIED(2),
        HAS_OFFSTORE(3);

        public static final int HAS_OFFSTORE_VALUE = 3;
        public static final int NO_EXTENSIONS_VALUE = 0;
        public static final int NO_OFFSTORE_UNVERIFIED_VALUE = 2;
        public static final int NO_OFFSTORE_VERIFIED_VALUE = 1;
        private static final fqw internalValueMap = new g0();
        private final int value;

        ExtensionsState(int i) {
            this.value = i;
        }

        public static ExtensionsState a(int i) {
            if (i == 0) {
                return NO_EXTENSIONS;
            }
            if (i == 1) {
                return NO_OFFSTORE_VERIFIED;
            }
            if (i == 2) {
                return NO_OFFSTORE_UNVERIFIED;
            }
            if (i != 3) {
                return null;
            }
            return HAS_OFFSTORE;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum InstallerPackage implements dqw {
        INSTALLER_PACKAGE_UNKNOWN(0),
        INSTALLER_PACKAGE_NONE(1),
        INSTALLER_PACKAGE_GOOGLE_PLAY_STORE(2),
        INSTALLER_PACKAGE_OTHER(3);

        public static final int INSTALLER_PACKAGE_GOOGLE_PLAY_STORE_VALUE = 2;
        public static final int INSTALLER_PACKAGE_NONE_VALUE = 1;
        public static final int INSTALLER_PACKAGE_OTHER_VALUE = 3;
        public static final int INSTALLER_PACKAGE_UNKNOWN_VALUE = 0;
        private static final fqw internalValueMap = new u1();
        private final int value;

        InstallerPackage(int i) {
            this.value = i;
        }

        public static InstallerPackage a(int i) {
            if (i == 0) {
                return INSTALLER_PACKAGE_UNKNOWN;
            }
            if (i == 1) {
                return INSTALLER_PACKAGE_NONE;
            }
            if (i == 2) {
                return INSTALLER_PACKAGE_GOOGLE_PLAY_STORE;
            }
            if (i != 3) {
                return null;
            }
            return INSTALLER_PACKAGE_OTHER;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum LTSChannel implements dqw {
        LTS_CHANNEL_UNKNOWN(0),
        LTS_CHANNEL_STABLE(1),
        LTS_CHANNEL_LTC(2),
        LTS_CHANNEL_LTS(3);

        public static final int LTS_CHANNEL_LTC_VALUE = 2;
        public static final int LTS_CHANNEL_LTS_VALUE = 3;
        public static final int LTS_CHANNEL_STABLE_VALUE = 1;
        public static final int LTS_CHANNEL_UNKNOWN_VALUE = 0;
        private static final fqw internalValueMap = new w1();
        private final int value;

        LTSChannel(int i) {
            this.value = i;
        }

        public static LTSChannel a(int i) {
            if (i == 0) {
                return LTS_CHANNEL_UNKNOWN;
            }
            if (i == 1) {
                return LTS_CHANNEL_STABLE;
            }
            if (i == 2) {
                return LTS_CHANNEL_LTC;
            }
            if (i != 3) {
                return null;
            }
            return LTS_CHANNEL_LTS;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum MetricsFilteringStatus implements dqw {
        METRICS_UNKNOWN(0),
        METRICS_ALL(1),
        METRICS_ONLY_CRITICAL(2);

        public static final int METRICS_ALL_VALUE = 1;
        public static final int METRICS_ONLY_CRITICAL_VALUE = 2;
        public static final int METRICS_UNKNOWN_VALUE = 0;
        private static final fqw internalValueMap = new z1();
        private final int value;

        MetricsFilteringStatus(int i) {
            this.value = i;
        }

        public static MetricsFilteringStatus a(int i) {
            if (i == 0) {
                return METRICS_UNKNOWN;
            }
            if (i == 1) {
                return METRICS_ALL;
            }
            if (i != 2) {
                return null;
            }
            return METRICS_ONLY_CRITICAL;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    public enum UmaDefaultState implements dqw {
        OPT_IN(0),
        OPT_OUT(1),
        POLICY_FORCED_ENABLED(2),
        OPT_UNKNOWN(3);

        public static final int OPT_IN_VALUE = 0;
        public static final int OPT_OUT_VALUE = 1;
        public static final int OPT_UNKNOWN_VALUE = 3;
        public static final int POLICY_FORCED_ENABLED_VALUE = 2;
        private static final fqw internalValueMap = new q2();
        private final int value;

        UmaDefaultState(int i) {
            this.value = i;
        }

        public static UmaDefaultState a(int i) {
            if (i == 0) {
                return OPT_IN;
            }
            if (i == 1) {
                return OPT_OUT;
            }
            if (i == 2) {
                return POLICY_FORCED_ENABLED;
            }
            if (i != 3) {
                return null;
            }
            return OPT_UNKNOWN;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto = new SystemProfileProtos$SystemProfileProto();
        DEFAULT_INSTANCE = systemProfileProtos$SystemProfileProto;
        GeneratedMessageLite.registerDefaultInstance(SystemProfileProtos$SystemProfileProto.class, systemProfileProtos$SystemProfileProto);
    }

    private SystemProfileProtos$SystemProfileProto() {
    }

    private void addAllAntivirusProduct(Iterable<? extends a> iterable) {
        ensureAntivirusProductIsMutable();
        com.google.protobuf.b.addAll(iterable, this.antivirusProduct_);
    }

    private void addAllChromeComponent(Iterable<? extends b> iterable) {
        ensureChromeComponentIsMutable();
        com.google.protobuf.b.addAll(iterable, this.chromeComponent_);
    }

    private void addAllCommandLineKeyHash(Iterable<? extends Integer> iterable) {
        ensureCommandLineKeyHashIsMutable();
        com.google.protobuf.b.addAll(iterable, this.commandLineKeyHash_);
    }

    private void addAllExternalAudioVideoDevice(Iterable<? extends ExternalAudioVideoDevice> iterable) {
        ensureExternalAudioVideoDeviceIsMutable();
        com.google.protobuf.b.addAll(iterable, this.externalAudioVideoDevice_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldTrial(Iterable<? extends e> iterable) {
        ensureFieldTrialIsMutable();
        com.google.protobuf.b.addAll(iterable, this.fieldTrial_);
    }

    private void addAllOccupiedExtensionBucket(Iterable<? extends Integer> iterable) {
        ensureOccupiedExtensionBucketIsMutable();
        com.google.protobuf.b.addAll(iterable, this.occupiedExtensionBucket_);
    }

    private void addAntivirusProduct(a aVar) {
        aVar.getClass();
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.add(aVar);
    }

    private void addChromeComponent(b bVar) {
        bVar.getClass();
        ensureChromeComponentIsMutable();
        this.chromeComponent_.add(bVar);
    }

    private void addCommandLineKeyHash(int i) {
        ensureCommandLineKeyHashIsMutable();
        ((o5w) this.commandLineKeyHash_).b(i);
    }

    private void addExternalAudioVideoDevice(ExternalAudioVideoDevice externalAudioVideoDevice) {
        externalAudioVideoDevice.getClass();
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.add(externalAudioVideoDevice);
    }

    private void addFieldTrial(e eVar) {
        eVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(eVar);
    }

    private void addOccupiedExtensionBucket(int i) {
        ensureOccupiedExtensionBucketIsMutable();
        ((o5w) this.occupiedExtensionBucket_).b(i);
    }

    private void clearAccessibilityState() {
        this.accessibilityState_ = null;
        this.bitField1_ &= -129;
    }

    private void clearAntivirusProduct() {
        this.antivirusProduct_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAppPackageName() {
        this.bitField0_ &= -1073741825;
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    private void clearAppPackageNameAllowlistFilter() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.appPackageNameAllowlistFilter_ = 0;
    }

    private void clearAppVersion() {
        this.bitField0_ &= -3;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    private void clearApplicationLocale() {
        this.bitField0_ &= -8193;
        this.applicationLocale_ = getDefaultInstance().getApplicationLocale();
    }

    private void clearBrandCode() {
        this.bitField0_ &= -9;
        this.brandCode_ = getDefaultInstance().getBrandCode();
    }

    private void clearBuildTimestamp() {
        this.bitField0_ &= -2;
        this.buildTimestamp_ = 0L;
    }

    private void clearChannel() {
        this.bitField0_ &= -17;
        this.channel_ = 0;
    }

    private void clearChromeComponent() {
        this.chromeComponent_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearClientIdWasUsedForTrialAssignment() {
        this.bitField0_ &= -2097153;
        this.clientIdWasUsedForTrialAssignment_ = false;
    }

    private void clearClientSideSamplingStatus() {
        this.bitField1_ &= -2;
        this.clientSideSamplingStatus_ = 0;
    }

    private void clearClientUuid() {
        this.bitField0_ &= -4194305;
        this.clientUuid_ = getDefaultInstance().getClientUuid();
    }

    private void clearClonedInstallInfo() {
        this.clonedInstallInfo_ = null;
        this.bitField0_ &= -513;
    }

    private void clearCommandLineKeyHash() {
        this.commandLineKeyHash_ = GeneratedMessageLite.emptyIntList();
    }

    private void clearDemoModeDimensions() {
        this.demoModeDimensions_ = null;
        this.bitField1_ &= -17;
    }

    private void clearExternalAccessPoint() {
        this.externalAccessPoint_ = null;
        this.bitField0_ &= -33554433;
    }

    private void clearExternalAudioVideoDevice() {
        this.externalAudioVideoDevice_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearFgBgId() {
        this.bitField0_ &= -16777217;
        this.fgBgId_ = 0;
    }

    private void clearFieldTrial() {
        this.fieldTrial_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearGoogleUpdate() {
        this.googleUpdate_ = null;
        this.bitField0_ &= -131073;
    }

    private void clearHardware() {
        this.hardware_ = null;
        this.bitField0_ &= -32769;
    }

    private void clearInstallDate() {
        this.bitField0_ &= -257;
        this.installDate_ = 0L;
    }

    private void clearInstallerPackage() {
        this.bitField1_ &= -5;
        this.installerPackage_ = 0;
    }

    private void clearIsExtendedStableChannel() {
        this.bitField0_ &= -33;
        this.isExtendedStableChannel_ = false;
    }

    private void clearIsInstrumentedBuild() {
        this.bitField0_ &= -65;
        this.isInstrumentedBuild_ = false;
    }

    private void clearLinkedAndroidPhoneData() {
        this.linkedAndroidPhoneData_ = null;
        this.bitField1_ &= -9;
    }

    private void clearLogWrittenByAppVersion() {
        this.bitField0_ &= -5;
        this.logWrittenByAppVersion_ = getDefaultInstance().getLogWrittenByAppVersion();
    }

    private void clearLowEntropySource() {
        this.bitField0_ &= -1025;
        this.lowEntropySource_ = 0;
    }

    private void clearLtsChannel() {
        this.bitField1_ &= -33;
        this.ltsChannel_ = 0;
    }

    private void clearMetricsFilteringStatus() {
        this.bitField1_ &= -3;
        this.metricsFilteringStatus_ = 0;
    }

    private void clearMultiProfileUserCount() {
        this.bitField0_ &= -67108865;
        this.multiProfileUserCount_ = 0;
    }

    private void clearNetwork() {
        this.network_ = null;
        this.bitField0_ &= -65537;
    }

    private void clearOccupiedExtensionBucket() {
        this.occupiedExtensionBucket_ = GeneratedMessageLite.emptyIntList();
    }

    private void clearOffstoreExtensionsState() {
        this.bitField0_ &= -268435457;
        this.offstoreExtensionsState_ = 0;
    }

    private void clearOldLowEntropySource() {
        this.bitField0_ &= -2049;
        this.oldLowEntropySource_ = 0;
    }

    private void clearOs() {
        this.os_ = null;
        this.bitField0_ &= -16385;
    }

    private void clearPseudoLowEntropySource() {
        this.bitField0_ &= -4097;
        this.pseudoLowEntropySource_ = 0;
    }

    private void clearSeedHasActiveLimitedLayer() {
        this.bitField0_ &= -1048577;
        this.seedHasActiveLimitedLayer_ = false;
    }

    private void clearSessionHash() {
        this.bitField0_ &= -8388609;
        this.sessionHash_ = 0L;
    }

    private void clearStability() {
        this.stability_ = null;
        this.bitField0_ &= -262145;
    }

    private void clearTpmIdentifier() {
        this.tpmIdentifier_ = null;
        this.bitField1_ &= -65;
    }

    private void clearUmaDefaultState() {
        this.bitField0_ &= -536870913;
        this.umaDefaultState_ = 0;
    }

    private void clearUmaEnabledDate() {
        this.bitField0_ &= -129;
        this.umaEnabledDate_ = 0L;
    }

    private void clearVariationsSeedVersion() {
        this.bitField0_ &= -524289;
        this.variationsSeedVersion_ = getDefaultInstance().getVariationsSeedVersion();
    }

    private void clearYa() {
        this.ya_ = null;
        this.bitField0_ &= -134217729;
    }

    private void ensureAntivirusProductIsMutable() {
        oqw oqwVar = this.antivirusProduct_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.antivirusProduct_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureChromeComponentIsMutable() {
        oqw oqwVar = this.chromeComponent_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.chromeComponent_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureCommandLineKeyHashIsMutable() {
        jqw jqwVar = this.commandLineKeyHash_;
        if (((p9) jqwVar).a) {
            return;
        }
        this.commandLineKeyHash_ = GeneratedMessageLite.mutableCopy(jqwVar);
    }

    private void ensureExternalAudioVideoDeviceIsMutable() {
        oqw oqwVar = this.externalAudioVideoDevice_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.externalAudioVideoDevice_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureFieldTrialIsMutable() {
        oqw oqwVar = this.fieldTrial_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.fieldTrial_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureOccupiedExtensionBucketIsMutable() {
        jqw jqwVar = this.occupiedExtensionBucket_;
        if (((p9) jqwVar).a) {
            return;
        }
        this.occupiedExtensionBucket_ = GeneratedMessageLite.mutableCopy(jqwVar);
    }

    public static SystemProfileProtos$SystemProfileProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAccessibilityState(AccessibilityState accessibilityState) {
        accessibilityState.getClass();
        AccessibilityState accessibilityState2 = this.accessibilityState_;
        if (accessibilityState2 == null || accessibilityState2 == AccessibilityState.getDefaultInstance()) {
            this.accessibilityState_ = accessibilityState;
        } else {
            this.accessibilityState_ = (AccessibilityState) ((k) AccessibilityState.newBuilder(this.accessibilityState_).mergeFrom((GeneratedMessageLite) accessibilityState)).buildPartial();
        }
        this.bitField1_ |= 128;
    }

    private void mergeClonedInstallInfo(c cVar) {
        cVar.getClass();
        c cVar2 = this.clonedInstallInfo_;
        if (cVar2 == null || cVar2 == c.getDefaultInstance()) {
            this.clonedInstallInfo_ = cVar;
        } else {
            this.clonedInstallInfo_ = (c) ((y) c.newBuilder(this.clonedInstallInfo_).mergeFrom((GeneratedMessageLite) cVar)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    private void mergeDemoModeDimensions(DemoModeDimensions demoModeDimensions) {
        demoModeDimensions.getClass();
        DemoModeDimensions demoModeDimensions2 = this.demoModeDimensions_;
        if (demoModeDimensions2 == null || demoModeDimensions2 == DemoModeDimensions.getDefaultInstance()) {
            this.demoModeDimensions_ = demoModeDimensions;
        } else {
            this.demoModeDimensions_ = (DemoModeDimensions) ((c0) DemoModeDimensions.newBuilder(this.demoModeDimensions_).mergeFrom((GeneratedMessageLite) demoModeDimensions)).buildPartial();
        }
        this.bitField1_ |= 16;
    }

    private void mergeExternalAccessPoint(d dVar) {
        dVar.getClass();
        d dVar2 = this.externalAccessPoint_;
        if (dVar2 == null || dVar2 == d.getDefaultInstance()) {
            this.externalAccessPoint_ = dVar;
        } else {
            this.externalAccessPoint_ = (d) ((i0) d.newBuilder(this.externalAccessPoint_).mergeFrom((GeneratedMessageLite) dVar)).buildPartial();
        }
        this.bitField0_ |= SelfTester_JCP.DECRYPT_CFB;
    }

    private void mergeGoogleUpdate(GoogleUpdate googleUpdate) {
        googleUpdate.getClass();
        GoogleUpdate googleUpdate2 = this.googleUpdate_;
        if (googleUpdate2 == null || googleUpdate2 == GoogleUpdate.getDefaultInstance()) {
            this.googleUpdate_ = googleUpdate;
        } else {
            this.googleUpdate_ = (GoogleUpdate) ((z0) GoogleUpdate.newBuilder(this.googleUpdate_).mergeFrom((GeneratedMessageLite) googleUpdate)).buildPartial();
        }
        this.bitField0_ |= 131072;
    }

    private void mergeHardware(Hardware hardware) {
        hardware.getClass();
        Hardware hardware2 = this.hardware_;
        if (hardware2 == null || hardware2 == Hardware.getDefaultInstance()) {
            this.hardware_ = hardware;
        } else {
            this.hardware_ = (Hardware) ((f1) Hardware.newBuilder(this.hardware_).mergeFrom((GeneratedMessageLite) hardware)).buildPartial();
        }
        this.bitField0_ |= 32768;
    }

    private void mergeLinkedAndroidPhoneData(f fVar) {
        fVar.getClass();
        f fVar2 = this.linkedAndroidPhoneData_;
        if (fVar2 == null || fVar2 == f.getDefaultInstance()) {
            this.linkedAndroidPhoneData_ = fVar;
        } else {
            this.linkedAndroidPhoneData_ = (f) ((y1) f.newBuilder(this.linkedAndroidPhoneData_).mergeFrom((GeneratedMessageLite) fVar)).buildPartial();
        }
        this.bitField1_ |= 8;
    }

    private void mergeNetwork(Network network) {
        network.getClass();
        Network network2 = this.network_;
        if (network2 == null || network2 == Network.getDefaultInstance()) {
            this.network_ = network;
        } else {
            this.network_ = (Network) ((b2) Network.newBuilder(this.network_).mergeFrom((GeneratedMessageLite) network)).buildPartial();
        }
        this.bitField0_ |= 65536;
    }

    private void mergeOs(OS os) {
        os.getClass();
        OS os2 = this.os_;
        if (os2 == null || os2 == OS.getDefaultInstance()) {
            this.os_ = os;
        } else {
            this.os_ = (OS) ((h2) OS.newBuilder(this.os_).mergeFrom((GeneratedMessageLite) os)).buildPartial();
        }
        this.bitField0_ |= 16384;
    }

    private void mergeStability(g gVar) {
        gVar.getClass();
        g gVar2 = this.stability_;
        if (gVar2 == null || gVar2 == g.getDefaultInstance()) {
            this.stability_ = gVar;
        } else {
            this.stability_ = (g) ((o2) g.newBuilder(this.stability_).mergeFrom((GeneratedMessageLite) gVar)).buildPartial();
        }
        this.bitField0_ |= 262144;
    }

    private void mergeTpmIdentifier(h hVar) {
        hVar.getClass();
        h hVar2 = this.tpmIdentifier_;
        if (hVar2 == null || hVar2 == h.getDefaultInstance()) {
            this.tpmIdentifier_ = hVar;
        } else {
            this.tpmIdentifier_ = (h) ((p2) h.newBuilder(this.tpmIdentifier_).mergeFrom((GeneratedMessageLite) hVar)).buildPartial();
        }
        this.bitField1_ |= 64;
    }

    private void mergeYa(Yandex yandex) {
        yandex.getClass();
        Yandex yandex2 = this.ya_;
        if (yandex2 == null || yandex2 == Yandex.getDefaultInstance()) {
            this.ya_ = yandex;
        } else {
            this.ya_ = (Yandex) ((s2) Yandex.newBuilder(this.ya_).mergeFrom((GeneratedMessageLite) yandex)).buildPartial();
        }
        this.bitField0_ |= SelfTester_JCP.DECRYPT_CNT;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemProfileProtos$SystemProfileProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAntivirusProduct(int i) {
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.remove(i);
    }

    private void removeChromeComponent(int i) {
        ensureChromeComponentIsMutable();
        this.chromeComponent_.remove(i);
    }

    private void removeExternalAudioVideoDevice(int i) {
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.remove(i);
    }

    private void removeFieldTrial(int i) {
        ensureFieldTrialIsMutable();
        this.fieldTrial_.remove(i);
    }

    private void setAccessibilityState(AccessibilityState accessibilityState) {
        accessibilityState.getClass();
        this.accessibilityState_ = accessibilityState;
        this.bitField1_ |= 128;
    }

    private void setAntivirusProduct(int i, a aVar) {
        aVar.getClass();
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.set(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1073741824;
        this.appPackageName_ = str;
    }

    private void setAppPackageNameAllowlistFilter(AppPackageNameAllowlistFilter appPackageNameAllowlistFilter) {
        this.appPackageNameAllowlistFilter_ = appPackageNameAllowlistFilter.getNumber();
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void setAppPackageNameBytes(ByteString byteString) {
        this.appPackageName_ = byteString.r();
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appVersion_ = str;
    }

    private void setAppVersionBytes(ByteString byteString) {
        this.appVersion_ = byteString.r();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationLocale(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.applicationLocale_ = str;
    }

    private void setApplicationLocaleBytes(ByteString byteString) {
        this.applicationLocale_ = byteString.r();
        this.bitField0_ |= 8192;
    }

    private void setBrandCode(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.brandCode_ = str;
    }

    private void setBrandCodeBytes(ByteString byteString) {
        this.brandCode_ = byteString.r();
        this.bitField0_ |= 8;
    }

    private void setBuildTimestamp(long j) {
        this.bitField0_ |= 1;
        this.buildTimestamp_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(Channel channel) {
        this.channel_ = channel.getNumber();
        this.bitField0_ |= 16;
    }

    private void setChromeComponent(int i, b bVar) {
        bVar.getClass();
        ensureChromeComponentIsMutable();
        this.chromeComponent_.set(i, bVar);
    }

    private void setClientIdWasUsedForTrialAssignment(boolean z) {
        this.bitField0_ |= 2097152;
        this.clientIdWasUsedForTrialAssignment_ = z;
    }

    private void setClientSideSamplingStatus(ClientSideSamplingStatus clientSideSamplingStatus) {
        this.clientSideSamplingStatus_ = clientSideSamplingStatus.getNumber();
        this.bitField1_ |= 1;
    }

    private void setClientUuid(String str) {
        str.getClass();
        this.bitField0_ |= SelfTester_JCP.ENCRYPT_CBC;
        this.clientUuid_ = str;
    }

    private void setClientUuidBytes(ByteString byteString) {
        this.clientUuid_ = byteString.r();
        this.bitField0_ |= SelfTester_JCP.ENCRYPT_CBC;
    }

    private void setClonedInstallInfo(c cVar) {
        cVar.getClass();
        this.clonedInstallInfo_ = cVar;
        this.bitField0_ |= 512;
    }

    private void setCommandLineKeyHash(int i, int i2) {
        ensureCommandLineKeyHashIsMutable();
        ((o5w) this.commandLineKeyHash_).g(i, i2);
    }

    private void setDemoModeDimensions(DemoModeDimensions demoModeDimensions) {
        demoModeDimensions.getClass();
        this.demoModeDimensions_ = demoModeDimensions;
        this.bitField1_ |= 16;
    }

    private void setExternalAccessPoint(d dVar) {
        dVar.getClass();
        this.externalAccessPoint_ = dVar;
        this.bitField0_ |= SelfTester_JCP.DECRYPT_CFB;
    }

    private void setExternalAudioVideoDevice(int i, ExternalAudioVideoDevice externalAudioVideoDevice) {
        externalAudioVideoDevice.getClass();
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.set(i, externalAudioVideoDevice);
    }

    private void setFgBgId(int i) {
        this.bitField0_ |= 16777216;
        this.fgBgId_ = i;
    }

    private void setFieldTrial(int i, e eVar) {
        eVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.set(i, eVar);
    }

    private void setGoogleUpdate(GoogleUpdate googleUpdate) {
        googleUpdate.getClass();
        this.googleUpdate_ = googleUpdate;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardware(Hardware hardware) {
        hardware.getClass();
        this.hardware_ = hardware;
        this.bitField0_ |= 32768;
    }

    private void setInstallDate(long j) {
        this.bitField0_ |= 256;
        this.installDate_ = j;
    }

    private void setInstallerPackage(InstallerPackage installerPackage) {
        this.installerPackage_ = installerPackage.getNumber();
        this.bitField1_ |= 4;
    }

    private void setIsExtendedStableChannel(boolean z) {
        this.bitField0_ |= 32;
        this.isExtendedStableChannel_ = z;
    }

    private void setIsInstrumentedBuild(boolean z) {
        this.bitField0_ |= 64;
        this.isInstrumentedBuild_ = z;
    }

    private void setLinkedAndroidPhoneData(f fVar) {
        fVar.getClass();
        this.linkedAndroidPhoneData_ = fVar;
        this.bitField1_ |= 8;
    }

    private void setLogWrittenByAppVersion(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.logWrittenByAppVersion_ = str;
    }

    private void setLogWrittenByAppVersionBytes(ByteString byteString) {
        this.logWrittenByAppVersion_ = byteString.r();
        this.bitField0_ |= 4;
    }

    private void setLowEntropySource(int i) {
        this.bitField0_ |= 1024;
        this.lowEntropySource_ = i;
    }

    private void setLtsChannel(LTSChannel lTSChannel) {
        this.ltsChannel_ = lTSChannel.getNumber();
        this.bitField1_ |= 32;
    }

    private void setMetricsFilteringStatus(MetricsFilteringStatus metricsFilteringStatus) {
        this.metricsFilteringStatus_ = metricsFilteringStatus.getNumber();
        this.bitField1_ |= 2;
    }

    private void setMultiProfileUserCount(int i) {
        this.bitField0_ |= SelfTester_JCP.DECRYPT_CBC;
        this.multiProfileUserCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(Network network) {
        network.getClass();
        this.network_ = network;
        this.bitField0_ |= 65536;
    }

    private void setOccupiedExtensionBucket(int i, int i2) {
        ensureOccupiedExtensionBucketIsMutable();
        ((o5w) this.occupiedExtensionBucket_).g(i, i2);
    }

    private void setOffstoreExtensionsState(ExtensionsState extensionsState) {
        this.offstoreExtensionsState_ = extensionsState.getNumber();
        this.bitField0_ |= SelfTester_JCP.IMITA;
    }

    private void setOldLowEntropySource(int i) {
        this.bitField0_ |= 2048;
        this.oldLowEntropySource_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(OS os) {
        os.getClass();
        this.os_ = os;
        this.bitField0_ |= 16384;
    }

    private void setPseudoLowEntropySource(int i) {
        this.bitField0_ |= 4096;
        this.pseudoLowEntropySource_ = i;
    }

    private void setSeedHasActiveLimitedLayer(boolean z) {
        this.bitField0_ |= 1048576;
        this.seedHasActiveLimitedLayer_ = z;
    }

    private void setSessionHash(long j) {
        this.bitField0_ |= SelfTester_JCP.ENCRYPT_CNT;
        this.sessionHash_ = j;
    }

    private void setStability(g gVar) {
        gVar.getClass();
        this.stability_ = gVar;
        this.bitField0_ |= 262144;
    }

    private void setTpmIdentifier(h hVar) {
        hVar.getClass();
        this.tpmIdentifier_ = hVar;
        this.bitField1_ |= 64;
    }

    private void setUmaDefaultState(UmaDefaultState umaDefaultState) {
        this.umaDefaultState_ = umaDefaultState.getNumber();
        this.bitField0_ |= 536870912;
    }

    private void setUmaEnabledDate(long j) {
        this.bitField0_ |= 128;
        this.umaEnabledDate_ = j;
    }

    private void setVariationsSeedVersion(String str) {
        str.getClass();
        this.bitField0_ |= 524288;
        this.variationsSeedVersion_ = str;
    }

    private void setVariationsSeedVersionBytes(ByteString byteString) {
        this.variationsSeedVersion_ = byteString.r();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYa(Yandex yandex) {
        yandex.getClass();
        this.ya_ = yandex;
        this.bitField0_ |= SelfTester_JCP.DECRYPT_CNT;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (p3x0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new SystemProfileProtos$SystemProfileProto();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001.\u0000\u0002\u0001Ϩ.\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဂ\u0007\u0004ဈ\r\u0005ဉ\u000e\u0006ဉ\u000f\bဉ\u0012\t\u001b\n᠌\u0004\u000bဉ\u0011\fဈ\u0003\rဉ\u0010\u000e\u001b\u000fဉ\u0019\u0010ဂ\b\u0011ဋ\u001a\u0012\u0016\u0013᠌\u001c\u0014ဇ\u0006\u0016᠌\u001d\u0017\u001b\u0018\u001b\u001aဈ\u001e\u001cဈ\u0013\u001dဉ#\u001fင\n င\u000b!ဇ\u0015\"ဈ\u0016#᠌\"$ဇ\u0005%င\f&)'ဉ\t(ဈ\u0002)ဉ$*᠌\u001f+᠌ ,᠌!-᠌%.စ\u0017/ဉ&0င\u00181ဉ'2ဇ\u0014Ϩဉ\u001b", new Object[]{"bitField0_", "bitField1_", "buildTimestamp_", "appVersion_", "umaEnabledDate_", "applicationLocale_", "os_", "hardware_", "stability_", "fieldTrial_", e.class, "channel_", t.a, "googleUpdate_", "brandCode_", "network_", "externalAudioVideoDevice_", ExternalAudioVideoDevice.class, "externalAccessPoint_", "installDate_", "multiProfileUserCount_", "occupiedExtensionBucket_", "offstoreExtensionsState_", h0.a, "isInstrumentedBuild_", "umaDefaultState_", r2.a, "antivirusProduct_", a.class, "chromeComponent_", b.class, "appPackageName_", "variationsSeedVersion_", "linkedAndroidPhoneData_", "lowEntropySource_", "oldLowEntropySource_", "clientIdWasUsedForTrialAssignment_", "clientUuid_", "installerPackage_", v1.a, "isExtendedStableChannel_", "pseudoLowEntropySource_", "commandLineKeyHash_", "clonedInstallInfo_", "logWrittenByAppVersion_", "demoModeDimensions_", "appPackageNameAllowlistFilter_", q.a, "clientSideSamplingStatus_", x.a, "metricsFilteringStatus_", a2.a, "ltsChannel_", x1.a, "sessionHash_", "tpmIdentifier_", "fgBgId_", "accessibilityState_", "seedHasActiveLimitedLayer_", "ya_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (SystemProfileProtos$SystemProfileProto.class) {
                    try {
                        of90Var = PARSER;
                        if (of90Var == null) {
                            of90Var = new oxs(DEFAULT_INSTANCE);
                            PARSER = of90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return of90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public AccessibilityState getAccessibilityState() {
        AccessibilityState accessibilityState = this.accessibilityState_;
        return accessibilityState == null ? AccessibilityState.getDefaultInstance() : accessibilityState;
    }

    public a getAntivirusProduct(int i) {
        return (a) this.antivirusProduct_.get(i);
    }

    public int getAntivirusProductCount() {
        return this.antivirusProduct_.size();
    }

    public List<a> getAntivirusProductList() {
        return this.antivirusProduct_;
    }

    public m getAntivirusProductOrBuilder(int i) {
        return (m) this.antivirusProduct_.get(i);
    }

    public List<? extends m> getAntivirusProductOrBuilderList() {
        return this.antivirusProduct_;
    }

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public AppPackageNameAllowlistFilter getAppPackageNameAllowlistFilter() {
        AppPackageNameAllowlistFilter a2 = AppPackageNameAllowlistFilter.a(this.appPackageNameAllowlistFilter_);
        return a2 == null ? AppPackageNameAllowlistFilter.SERVER_SIDE_FILTER_UNSPECIFIED : a2;
    }

    public ByteString getAppPackageNameBytes() {
        return ByteString.g(this.appPackageName_);
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public ByteString getAppVersionBytes() {
        return ByteString.g(this.appVersion_);
    }

    public String getApplicationLocale() {
        return this.applicationLocale_;
    }

    public ByteString getApplicationLocaleBytes() {
        return ByteString.g(this.applicationLocale_);
    }

    public String getBrandCode() {
        return this.brandCode_;
    }

    public ByteString getBrandCodeBytes() {
        return ByteString.g(this.brandCode_);
    }

    public long getBuildTimestamp() {
        return this.buildTimestamp_;
    }

    public Channel getChannel() {
        Channel a2 = Channel.a(this.channel_);
        return a2 == null ? Channel.CHANNEL_UNKNOWN : a2;
    }

    public b getChromeComponent(int i) {
        return (b) this.chromeComponent_.get(i);
    }

    public int getChromeComponentCount() {
        return this.chromeComponent_.size();
    }

    public List<b> getChromeComponentList() {
        return this.chromeComponent_;
    }

    public v getChromeComponentOrBuilder(int i) {
        return (v) this.chromeComponent_.get(i);
    }

    public List<? extends v> getChromeComponentOrBuilderList() {
        return this.chromeComponent_;
    }

    public boolean getClientIdWasUsedForTrialAssignment() {
        return this.clientIdWasUsedForTrialAssignment_;
    }

    public ClientSideSamplingStatus getClientSideSamplingStatus() {
        ClientSideSamplingStatus a2 = ClientSideSamplingStatus.a(this.clientSideSamplingStatus_);
        return a2 == null ? ClientSideSamplingStatus.SAMPLING_UNKNOWN : a2;
    }

    public String getClientUuid() {
        return this.clientUuid_;
    }

    public ByteString getClientUuidBytes() {
        return ByteString.g(this.clientUuid_);
    }

    public c getClonedInstallInfo() {
        c cVar = this.clonedInstallInfo_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public int getCommandLineKeyHash(int i) {
        return ((o5w) this.commandLineKeyHash_).e(i);
    }

    public int getCommandLineKeyHashCount() {
        return this.commandLineKeyHash_.size();
    }

    public List<Integer> getCommandLineKeyHashList() {
        return this.commandLineKeyHash_;
    }

    public DemoModeDimensions getDemoModeDimensions() {
        DemoModeDimensions demoModeDimensions = this.demoModeDimensions_;
        return demoModeDimensions == null ? DemoModeDimensions.getDefaultInstance() : demoModeDimensions;
    }

    public d getExternalAccessPoint() {
        d dVar = this.externalAccessPoint_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public ExternalAudioVideoDevice getExternalAudioVideoDevice(int i) {
        return (ExternalAudioVideoDevice) this.externalAudioVideoDevice_.get(i);
    }

    public int getExternalAudioVideoDeviceCount() {
        return this.externalAudioVideoDevice_.size();
    }

    public List<ExternalAudioVideoDevice> getExternalAudioVideoDeviceList() {
        return this.externalAudioVideoDevice_;
    }

    public x0 getExternalAudioVideoDeviceOrBuilder(int i) {
        return (x0) this.externalAudioVideoDevice_.get(i);
    }

    public List<? extends x0> getExternalAudioVideoDeviceOrBuilderList() {
        return this.externalAudioVideoDevice_;
    }

    public int getFgBgId() {
        return this.fgBgId_;
    }

    public e getFieldTrial(int i) {
        return (e) this.fieldTrial_.get(i);
    }

    public int getFieldTrialCount() {
        return this.fieldTrial_.size();
    }

    public List<e> getFieldTrialList() {
        return this.fieldTrial_;
    }

    public q3x0 getFieldTrialOrBuilder(int i) {
        return (q3x0) this.fieldTrial_.get(i);
    }

    public List<? extends q3x0> getFieldTrialOrBuilderList() {
        return this.fieldTrial_;
    }

    public GoogleUpdate getGoogleUpdate() {
        GoogleUpdate googleUpdate = this.googleUpdate_;
        return googleUpdate == null ? GoogleUpdate.getDefaultInstance() : googleUpdate;
    }

    public Hardware getHardware() {
        Hardware hardware = this.hardware_;
        return hardware == null ? Hardware.getDefaultInstance() : hardware;
    }

    public long getInstallDate() {
        return this.installDate_;
    }

    public InstallerPackage getInstallerPackage() {
        InstallerPackage a2 = InstallerPackage.a(this.installerPackage_);
        return a2 == null ? InstallerPackage.INSTALLER_PACKAGE_UNKNOWN : a2;
    }

    public boolean getIsExtendedStableChannel() {
        return this.isExtendedStableChannel_;
    }

    public boolean getIsInstrumentedBuild() {
        return this.isInstrumentedBuild_;
    }

    public f getLinkedAndroidPhoneData() {
        f fVar = this.linkedAndroidPhoneData_;
        return fVar == null ? f.getDefaultInstance() : fVar;
    }

    public String getLogWrittenByAppVersion() {
        return this.logWrittenByAppVersion_;
    }

    public ByteString getLogWrittenByAppVersionBytes() {
        return ByteString.g(this.logWrittenByAppVersion_);
    }

    public int getLowEntropySource() {
        return this.lowEntropySource_;
    }

    public LTSChannel getLtsChannel() {
        LTSChannel a2 = LTSChannel.a(this.ltsChannel_);
        return a2 == null ? LTSChannel.LTS_CHANNEL_UNKNOWN : a2;
    }

    public MetricsFilteringStatus getMetricsFilteringStatus() {
        MetricsFilteringStatus a2 = MetricsFilteringStatus.a(this.metricsFilteringStatus_);
        return a2 == null ? MetricsFilteringStatus.METRICS_UNKNOWN : a2;
    }

    public int getMultiProfileUserCount() {
        return this.multiProfileUserCount_;
    }

    public Network getNetwork() {
        Network network = this.network_;
        return network == null ? Network.getDefaultInstance() : network;
    }

    public int getOccupiedExtensionBucket(int i) {
        return ((o5w) this.occupiedExtensionBucket_).e(i);
    }

    public int getOccupiedExtensionBucketCount() {
        return this.occupiedExtensionBucket_.size();
    }

    public List<Integer> getOccupiedExtensionBucketList() {
        return this.occupiedExtensionBucket_;
    }

    public ExtensionsState getOffstoreExtensionsState() {
        ExtensionsState a2 = ExtensionsState.a(this.offstoreExtensionsState_);
        return a2 == null ? ExtensionsState.NO_EXTENSIONS : a2;
    }

    public int getOldLowEntropySource() {
        return this.oldLowEntropySource_;
    }

    public OS getOs() {
        OS os = this.os_;
        return os == null ? OS.getDefaultInstance() : os;
    }

    public int getPseudoLowEntropySource() {
        return this.pseudoLowEntropySource_;
    }

    public boolean getSeedHasActiveLimitedLayer() {
        return this.seedHasActiveLimitedLayer_;
    }

    public long getSessionHash() {
        return this.sessionHash_;
    }

    public g getStability() {
        g gVar = this.stability_;
        return gVar == null ? g.getDefaultInstance() : gVar;
    }

    public h getTpmIdentifier() {
        h hVar = this.tpmIdentifier_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public UmaDefaultState getUmaDefaultState() {
        UmaDefaultState a2 = UmaDefaultState.a(this.umaDefaultState_);
        return a2 == null ? UmaDefaultState.OPT_IN : a2;
    }

    public long getUmaEnabledDate() {
        return this.umaEnabledDate_;
    }

    public String getVariationsSeedVersion() {
        return this.variationsSeedVersion_;
    }

    public ByteString getVariationsSeedVersionBytes() {
        return ByteString.g(this.variationsSeedVersion_);
    }

    public Yandex getYa() {
        Yandex yandex = this.ya_;
        return yandex == null ? Yandex.getDefaultInstance() : yandex;
    }

    public boolean hasAccessibilityState() {
        return (this.bitField1_ & 128) != 0;
    }

    public boolean hasAppPackageName() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasAppPackageNameAllowlistFilter() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasApplicationLocale() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasBrandCode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasBuildTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasClientIdWasUsedForTrialAssignment() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasClientSideSamplingStatus() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasClientUuid() {
        return (this.bitField0_ & SelfTester_JCP.ENCRYPT_CBC) != 0;
    }

    public boolean hasClonedInstallInfo() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasDemoModeDimensions() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasExternalAccessPoint() {
        return (this.bitField0_ & SelfTester_JCP.DECRYPT_CFB) != 0;
    }

    public boolean hasFgBgId() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasGoogleUpdate() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasHardware() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasInstallDate() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasInstallerPackage() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasIsExtendedStableChannel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIsInstrumentedBuild() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLinkedAndroidPhoneData() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasLogWrittenByAppVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLowEntropySource() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasLtsChannel() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasMetricsFilteringStatus() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasMultiProfileUserCount() {
        return (this.bitField0_ & SelfTester_JCP.DECRYPT_CBC) != 0;
    }

    public boolean hasNetwork() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasOffstoreExtensionsState() {
        return (this.bitField0_ & SelfTester_JCP.IMITA) != 0;
    }

    public boolean hasOldLowEntropySource() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasOs() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasPseudoLowEntropySource() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSeedHasActiveLimitedLayer() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasSessionHash() {
        return (this.bitField0_ & SelfTester_JCP.ENCRYPT_CNT) != 0;
    }

    public boolean hasStability() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasTpmIdentifier() {
        return (this.bitField1_ & 64) != 0;
    }

    public boolean hasUmaDefaultState() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasUmaEnabledDate() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVariationsSeedVersion() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasYa() {
        return (this.bitField0_ & SelfTester_JCP.DECRYPT_CNT) != 0;
    }

    /* loaded from: classes2.dex */
    public static final class DemoModeDimensions extends GeneratedMessageLite implements zt10 {
        public static final int APP_VERSION_FIELD_NUMBER = 4;
        public static final int COUNTRY_FIELD_NUMBER = 1;
        public static final int CUSTOMIZATION_FACET_FIELD_NUMBER = 3;
        private static final DemoModeDimensions DEFAULT_INSTANCE;
        private static volatile of90 PARSER = null;
        public static final int RESOURCES_VERSION_FIELD_NUMBER = 5;
        public static final int RETAILER_FIELD_NUMBER = 2;
        private static final kqw customizationFacet_converter_ = new b0();
        private int bitField0_;
        private int customizationFacetMemoizedSerializedSize;
        private a retailer_;
        private String country_ = "";
        private jqw customizationFacet_ = GeneratedMessageLite.emptyIntList();
        private String appVersion_ = "";
        private String resourcesVersion_ = "";

        public enum CustomizationFacet implements dqw {
            UNDEFINED(0),
            CLOUD_GAMING_DEVICE(1),
            FEATURE_AWARE_DEVICE(2);

            public static final int CLOUD_GAMING_DEVICE_VALUE = 1;
            public static final int FEATURE_AWARE_DEVICE_VALUE = 2;
            public static final int UNDEFINED_VALUE = 0;
            private static final fqw internalValueMap = new d0();
            private final int value;

            CustomizationFacet(int i) {
                this.value = i;
            }

            public static CustomizationFacet a(int i) {
                if (i == 0) {
                    return UNDEFINED;
                }
                if (i == 1) {
                    return CLOUD_GAMING_DEVICE;
                }
                if (i != 2) {
                    return null;
                }
                return FEATURE_AWARE_DEVICE;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            DemoModeDimensions demoModeDimensions = new DemoModeDimensions();
            DEFAULT_INSTANCE = demoModeDimensions;
            GeneratedMessageLite.registerDefaultInstance(DemoModeDimensions.class, demoModeDimensions);
        }

        private DemoModeDimensions() {
        }

        private void addAllCustomizationFacet(Iterable<? extends CustomizationFacet> iterable) {
            ensureCustomizationFacetIsMutable();
            for (CustomizationFacet customizationFacet : iterable) {
                ((o5w) this.customizationFacet_).b(customizationFacet.getNumber());
            }
        }

        private void addCustomizationFacet(CustomizationFacet customizationFacet) {
            customizationFacet.getClass();
            ensureCustomizationFacetIsMutable();
            ((o5w) this.customizationFacet_).b(customizationFacet.getNumber());
        }

        private void clearAppVersion() {
            this.bitField0_ &= -5;
            this.appVersion_ = getDefaultInstance().getAppVersion();
        }

        private void clearCountry() {
            this.bitField0_ &= -2;
            this.country_ = getDefaultInstance().getCountry();
        }

        private void clearCustomizationFacet() {
            this.customizationFacet_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearResourcesVersion() {
            this.bitField0_ &= -9;
            this.resourcesVersion_ = getDefaultInstance().getResourcesVersion();
        }

        private void clearRetailer() {
            this.retailer_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureCustomizationFacetIsMutable() {
            jqw jqwVar = this.customizationFacet_;
            if (((p9) jqwVar).a) {
                return;
            }
            this.customizationFacet_ = GeneratedMessageLite.mutableCopy(jqwVar);
        }

        public static DemoModeDimensions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeRetailer(a aVar) {
            aVar.getClass();
            a aVar2 = this.retailer_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.retailer_ = aVar;
            } else {
                this.retailer_ = (a) ((f0) a.newBuilder(this.retailer_).mergeFrom((GeneratedMessageLite) aVar)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static c0 newBuilder() {
            return (c0) DEFAULT_INSTANCE.createBuilder();
        }

        public static DemoModeDimensions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DemoModeDimensions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DemoModeDimensions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.appVersion_ = str;
        }

        private void setAppVersionBytes(ByteString byteString) {
            this.appVersion_ = byteString.r();
            this.bitField0_ |= 4;
        }

        private void setCountry(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.country_ = str;
        }

        private void setCountryBytes(ByteString byteString) {
            this.country_ = byteString.r();
            this.bitField0_ |= 1;
        }

        private void setCustomizationFacet(int i, CustomizationFacet customizationFacet) {
            customizationFacet.getClass();
            ensureCustomizationFacetIsMutable();
            ((o5w) this.customizationFacet_).g(i, customizationFacet.getNumber());
        }

        private void setResourcesVersion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.resourcesVersion_ = str;
        }

        private void setResourcesVersionBytes(ByteString byteString) {
            this.resourcesVersion_ = byteString.r();
            this.bitField0_ |= 8;
        }

        private void setRetailer(a aVar) {
            aVar.getClass();
            this.retailer_ = aVar;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DemoModeDimensions();
                case 2:
                    return new c0(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ࠬ\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "country_", "retailer_", "customizationFacet_", e0.a, "appVersion_", "resourcesVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (DemoModeDimensions.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public String getAppVersion() {
            return this.appVersion_;
        }

        public ByteString getAppVersionBytes() {
            return ByteString.g(this.appVersion_);
        }

        public String getCountry() {
            return this.country_;
        }

        public ByteString getCountryBytes() {
            return ByteString.g(this.country_);
        }

        public CustomizationFacet getCustomizationFacet(int i) {
            CustomizationFacet a2 = CustomizationFacet.a(((o5w) this.customizationFacet_).e(i));
            return a2 == null ? CustomizationFacet.UNDEFINED : a2;
        }

        public int getCustomizationFacetCount() {
            return this.customizationFacet_.size();
        }

        public List<CustomizationFacet> getCustomizationFacetList() {
            return new lqw(this.customizationFacet_, customizationFacet_converter_);
        }

        public String getResourcesVersion() {
            return this.resourcesVersion_;
        }

        public ByteString getResourcesVersionBytes() {
            return ByteString.g(this.resourcesVersion_);
        }

        public a getRetailer() {
            a aVar = this.retailer_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public boolean hasAppVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCountry() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResourcesVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRetailer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static final class a extends GeneratedMessageLite implements zt10 {
            private static final a DEFAULT_INSTANCE;
            private static volatile of90 PARSER = null;
            public static final int RETAILER_ID_FIELD_NUMBER = 1;
            public static final int STORE_ID_FIELD_NUMBER = 2;
            private int bitField0_;
            private String retailerId_ = "";
            private String storeId_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearRetailerId() {
                this.bitField0_ &= -2;
                this.retailerId_ = getDefaultInstance().getRetailerId();
            }

            private void clearStoreId() {
                this.bitField0_ &= -3;
                this.storeId_ = getDefaultInstance().getStoreId();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static f0 newBuilder() {
                return (f0) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRetailerId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.retailerId_ = str;
            }

            private void setRetailerIdBytes(ByteString byteString) {
                this.retailerId_ = byteString.r();
                this.bitField0_ |= 1;
            }

            private void setStoreId(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.storeId_ = str;
            }

            private void setStoreIdBytes(ByteString byteString) {
                this.storeId_ = byteString.r();
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new f0(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "retailerId_", "storeId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (a.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public String getRetailerId() {
                return this.retailerId_;
            }

            public ByteString getRetailerIdBytes() {
                return ByteString.g(this.retailerId_);
            }

            public String getStoreId() {
                return this.storeId_;
            }

            public ByteString getStoreIdBytes() {
                return ByteString.g(this.storeId_);
            }

            public boolean hasRetailerId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasStoreId() {
                return (this.bitField0_ & 2) != 0;
            }

            public static f0 newBuilder(a aVar) {
                return (f0) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static a parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static a parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static a parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(eac eacVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static a parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        public static c0 newBuilder(DemoModeDimensions demoModeDimensions) {
            return (c0) DEFAULT_INSTANCE.createBuilder(demoModeDimensions);
        }

        public static DemoModeDimensions parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (DemoModeDimensions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static DemoModeDimensions parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static DemoModeDimensions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DemoModeDimensions parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static DemoModeDimensions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DemoModeDimensions parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static DemoModeDimensions parseFrom(InputStream inputStream) throws IOException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DemoModeDimensions parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static DemoModeDimensions parseFrom(eac eacVar) throws IOException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static DemoModeDimensions parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (DemoModeDimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class ExternalAudioVideoDevice extends GeneratedMessageLite implements x0 {
        public static final int AUDIO_DESCRIPTION_FIELD_NUMBER = 9;
        public static final int AV_DEVICE_TYPE_FIELD_NUMBER = 4;
        public static final int BIT_DEPTH_FIELD_NUMBER = 16;
        public static final int CEC_COMMAND_FIELD_NUMBER = 13;
        public static final int CEC_VERSION_FIELD_NUMBER = 12;
        public static final int COLOR_ENCODING_FIELD_NUMBER = 15;
        public static final int CURRENT_HDCP_VERSION_FIELD_NUMBER = 24;
        private static final ExternalAudioVideoDevice DEFAULT_INSTANCE;
        public static final int DOLBY_VISION_SUPPORT_FIELD_NUMBER = 19;
        public static final int EOTF_SUPPORT_FIELD_NUMBER = 20;
        public static final int FRAME_RATE_FIELD_NUMBER = 14;
        public static final int HDR10_SUPPORT_FIELD_NUMBER = 18;
        public static final int HORIZONTAL_RESOLUTION_FIELD_NUMBER = 7;
        public static final int IS_IN_PATH_TO_TV_FIELD_NUMBER = 11;
        public static final int MANUFACTURER_NAME_FIELD_NUMBER = 1;
        public static final int MANUFACTURE_WEEK_FIELD_NUMBER = 6;
        public static final int MANUFACTURE_YEAR_FIELD_NUMBER = 5;
        public static final int MAXIMUM_SUPPORTED_HDCP_VERSION_FIELD_NUMBER = 23;
        public static final int MODEL_NAME_FIELD_NUMBER = 2;
        private static volatile of90 PARSER = null;
        public static final int POSITION_IN_SETUP_FIELD_NUMBER = 10;
        public static final int PRODUCT_CODE_FIELD_NUMBER = 3;
        public static final int TMDS_FIELD_NUMBER = 17;
        public static final int VERTICAL_RESOLUTION_FIELD_NUMBER = 8;
        public static final int YUV_420_SUPPORT_FIELD_NUMBER = 22;
        public static final int YUV_SUPPORT_FIELD_NUMBER = 21;
        private static final kqw avDeviceType_converter_ = new j0();
        private int bitDepth_;
        private int bitField0_;
        private int cecVersion_;
        private int colorEncoding_;
        private int currentHdcpVersion_;
        private boolean dolbyVisionSupport_;
        private int eotfSupport_;
        private int frameRate_;
        private boolean hdr10Support_;
        private int horizontalResolution_;
        private boolean isInPathToTv_;
        private int manufactureWeek_;
        private int manufactureYear_;
        private int maximumSupportedHdcpVersion_;
        private int positionInSetup_;
        private int tmds_;
        private int verticalResolution_;
        private boolean yuv420Support_;
        private boolean yuvSupport_;
        private String manufacturerName_ = "";
        private String modelName_ = "";
        private String productCode_ = "";
        private jqw avDeviceType_ = GeneratedMessageLite.emptyIntList();
        private oqw audioDescription_ = GeneratedMessageLite.emptyProtobufList();
        private oqw cecCommand_ = GeneratedMessageLite.emptyProtobufList();

        public enum AVDeviceType implements dqw {
            AV_DEVICE_TYPE_UNKNOWN(0),
            AV_DEVICE_TYPE_TV(1),
            AV_DEVICE_TYPE_RECORDER(2),
            AV_DEVICE_TYPE_TUNER(3),
            AV_DEVICE_TYPE_PLAYER(4),
            AV_DEVICE_TYPE_AUDIO_SYSTEM(5);

            public static final int AV_DEVICE_TYPE_AUDIO_SYSTEM_VALUE = 5;
            public static final int AV_DEVICE_TYPE_PLAYER_VALUE = 4;
            public static final int AV_DEVICE_TYPE_RECORDER_VALUE = 2;
            public static final int AV_DEVICE_TYPE_TUNER_VALUE = 3;
            public static final int AV_DEVICE_TYPE_TV_VALUE = 1;
            public static final int AV_DEVICE_TYPE_UNKNOWN_VALUE = 0;
            private static final fqw internalValueMap = new k0();
            private final int value;

            AVDeviceType(int i) {
                this.value = i;
            }

            public static AVDeviceType a(int i) {
                if (i == 0) {
                    return AV_DEVICE_TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return AV_DEVICE_TYPE_TV;
                }
                if (i == 2) {
                    return AV_DEVICE_TYPE_RECORDER;
                }
                if (i == 3) {
                    return AV_DEVICE_TYPE_TUNER;
                }
                if (i == 4) {
                    return AV_DEVICE_TYPE_PLAYER;
                }
                if (i != 5) {
                    return null;
                }
                return AV_DEVICE_TYPE_AUDIO_SYSTEM;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum ColorEncoding implements dqw {
            COLOR_ENCODING_UNKNOWN(0),
            COLOR_ENCODING_RGB(1),
            COLOR_ENCODING_YUV444(2),
            COLOR_ENCODING_YUV422(3),
            COLOR_ENCODING_YUV420(4);

            public static final int COLOR_ENCODING_RGB_VALUE = 1;
            public static final int COLOR_ENCODING_UNKNOWN_VALUE = 0;
            public static final int COLOR_ENCODING_YUV420_VALUE = 4;
            public static final int COLOR_ENCODING_YUV422_VALUE = 3;
            public static final int COLOR_ENCODING_YUV444_VALUE = 2;
            private static final fqw internalValueMap = new v0();
            private final int value;

            ColorEncoding(int i) {
                this.value = i;
            }

            public static ColorEncoding a(int i) {
                if (i == 0) {
                    return COLOR_ENCODING_UNKNOWN;
                }
                if (i == 1) {
                    return COLOR_ENCODING_RGB;
                }
                if (i == 2) {
                    return COLOR_ENCODING_YUV444;
                }
                if (i == 3) {
                    return COLOR_ENCODING_YUV422;
                }
                if (i != 4) {
                    return null;
                }
                return COLOR_ENCODING_YUV420;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            ExternalAudioVideoDevice externalAudioVideoDevice = new ExternalAudioVideoDevice();
            DEFAULT_INSTANCE = externalAudioVideoDevice;
            GeneratedMessageLite.registerDefaultInstance(ExternalAudioVideoDevice.class, externalAudioVideoDevice);
        }

        private ExternalAudioVideoDevice() {
        }

        private void addAllAudioDescription(Iterable<? extends AudioDescription> iterable) {
            ensureAudioDescriptionIsMutable();
            com.google.protobuf.b.addAll(iterable, this.audioDescription_);
        }

        private void addAllAvDeviceType(Iterable<? extends AVDeviceType> iterable) {
            ensureAvDeviceTypeIsMutable();
            for (AVDeviceType aVDeviceType : iterable) {
                ((o5w) this.avDeviceType_).b(aVDeviceType.getNumber());
            }
        }

        private void addAllCecCommand(Iterable<? extends a> iterable) {
            ensureCecCommandIsMutable();
            com.google.protobuf.b.addAll(iterable, this.cecCommand_);
        }

        private void addAudioDescription(AudioDescription audioDescription) {
            audioDescription.getClass();
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.add(audioDescription);
        }

        private void addAvDeviceType(AVDeviceType aVDeviceType) {
            aVDeviceType.getClass();
            ensureAvDeviceTypeIsMutable();
            ((o5w) this.avDeviceType_).b(aVDeviceType.getNumber());
        }

        private void addCecCommand(a aVar) {
            aVar.getClass();
            ensureCecCommandIsMutable();
            this.cecCommand_.add(aVar);
        }

        private void clearAudioDescription() {
            this.audioDescription_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearAvDeviceType() {
            this.avDeviceType_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearBitDepth() {
            this.bitField0_ &= -4097;
            this.bitDepth_ = 0;
        }

        private void clearCecCommand() {
            this.cecCommand_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearCecVersion() {
            this.bitField0_ &= -513;
            this.cecVersion_ = 0;
        }

        private void clearColorEncoding() {
            this.bitField0_ &= -2049;
            this.colorEncoding_ = 0;
        }

        private void clearCurrentHdcpVersion() {
            this.bitField0_ &= -1048577;
            this.currentHdcpVersion_ = 0;
        }

        private void clearDolbyVisionSupport() {
            this.bitField0_ &= -32769;
            this.dolbyVisionSupport_ = false;
        }

        private void clearEotfSupport() {
            this.bitField0_ &= -65537;
            this.eotfSupport_ = 0;
        }

        private void clearFrameRate() {
            this.bitField0_ &= -1025;
            this.frameRate_ = 0;
        }

        private void clearHdr10Support() {
            this.bitField0_ &= -16385;
            this.hdr10Support_ = false;
        }

        private void clearHorizontalResolution() {
            this.bitField0_ &= -33;
            this.horizontalResolution_ = 0;
        }

        private void clearIsInPathToTv() {
            this.bitField0_ &= -257;
            this.isInPathToTv_ = false;
        }

        private void clearManufactureWeek() {
            this.bitField0_ &= -17;
            this.manufactureWeek_ = 0;
        }

        private void clearManufactureYear() {
            this.bitField0_ &= -9;
            this.manufactureYear_ = 0;
        }

        private void clearManufacturerName() {
            this.bitField0_ &= -2;
            this.manufacturerName_ = getDefaultInstance().getManufacturerName();
        }

        private void clearMaximumSupportedHdcpVersion() {
            this.bitField0_ &= -524289;
            this.maximumSupportedHdcpVersion_ = 0;
        }

        private void clearModelName() {
            this.bitField0_ &= -3;
            this.modelName_ = getDefaultInstance().getModelName();
        }

        private void clearPositionInSetup() {
            this.bitField0_ &= -129;
            this.positionInSetup_ = 0;
        }

        private void clearProductCode() {
            this.bitField0_ &= -5;
            this.productCode_ = getDefaultInstance().getProductCode();
        }

        private void clearTmds() {
            this.bitField0_ &= -8193;
            this.tmds_ = 0;
        }

        private void clearVerticalResolution() {
            this.bitField0_ &= -65;
            this.verticalResolution_ = 0;
        }

        private void clearYuv420Support() {
            this.bitField0_ &= -262145;
            this.yuv420Support_ = false;
        }

        private void clearYuvSupport() {
            this.bitField0_ &= -131073;
            this.yuvSupport_ = false;
        }

        private void ensureAudioDescriptionIsMutable() {
            oqw oqwVar = this.audioDescription_;
            if (((p9) oqwVar).a) {
                return;
            }
            this.audioDescription_ = GeneratedMessageLite.mutableCopy(oqwVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureAvDeviceTypeIsMutable() {
            jqw jqwVar = this.avDeviceType_;
            if (((p9) jqwVar).a) {
                return;
            }
            this.avDeviceType_ = GeneratedMessageLite.mutableCopy(jqwVar);
        }

        private void ensureCecCommandIsMutable() {
            oqw oqwVar = this.cecCommand_;
            if (((p9) oqwVar).a) {
                return;
            }
            this.cecCommand_ = GeneratedMessageLite.mutableCopy(oqwVar);
        }

        public static ExternalAudioVideoDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static s0 newBuilder() {
            return (s0) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExternalAudioVideoDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalAudioVideoDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAudioDescription(int i) {
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.remove(i);
        }

        private void removeCecCommand(int i) {
            ensureCecCommandIsMutable();
            this.cecCommand_.remove(i);
        }

        private void setAudioDescription(int i, AudioDescription audioDescription) {
            audioDescription.getClass();
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.set(i, audioDescription);
        }

        private void setAvDeviceType(int i, AVDeviceType aVDeviceType) {
            aVDeviceType.getClass();
            ensureAvDeviceTypeIsMutable();
            ((o5w) this.avDeviceType_).g(i, aVDeviceType.getNumber());
        }

        private void setBitDepth(int i) {
            this.bitField0_ |= 4096;
            this.bitDepth_ = i;
        }

        private void setCecCommand(int i, a aVar) {
            aVar.getClass();
            ensureCecCommandIsMutable();
            this.cecCommand_.set(i, aVar);
        }

        private void setCecVersion(int i) {
            this.bitField0_ |= 512;
            this.cecVersion_ = i;
        }

        private void setColorEncoding(ColorEncoding colorEncoding) {
            this.colorEncoding_ = colorEncoding.getNumber();
            this.bitField0_ |= 2048;
        }

        private void setCurrentHdcpVersion(int i) {
            this.bitField0_ |= 1048576;
            this.currentHdcpVersion_ = i;
        }

        private void setDolbyVisionSupport(boolean z) {
            this.bitField0_ |= 32768;
            this.dolbyVisionSupport_ = z;
        }

        private void setEotfSupport(int i) {
            this.bitField0_ |= 65536;
            this.eotfSupport_ = i;
        }

        private void setFrameRate(int i) {
            this.bitField0_ |= 1024;
            this.frameRate_ = i;
        }

        private void setHdr10Support(boolean z) {
            this.bitField0_ |= 16384;
            this.hdr10Support_ = z;
        }

        private void setHorizontalResolution(int i) {
            this.bitField0_ |= 32;
            this.horizontalResolution_ = i;
        }

        private void setIsInPathToTv(boolean z) {
            this.bitField0_ |= 256;
            this.isInPathToTv_ = z;
        }

        private void setManufactureWeek(int i) {
            this.bitField0_ |= 16;
            this.manufactureWeek_ = i;
        }

        private void setManufactureYear(int i) {
            this.bitField0_ |= 8;
            this.manufactureYear_ = i;
        }

        private void setManufacturerName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.manufacturerName_ = str;
        }

        private void setManufacturerNameBytes(ByteString byteString) {
            this.manufacturerName_ = byteString.r();
            this.bitField0_ |= 1;
        }

        private void setMaximumSupportedHdcpVersion(int i) {
            this.bitField0_ |= 524288;
            this.maximumSupportedHdcpVersion_ = i;
        }

        private void setModelName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.modelName_ = str;
        }

        private void setModelNameBytes(ByteString byteString) {
            this.modelName_ = byteString.r();
            this.bitField0_ |= 2;
        }

        private void setPositionInSetup(int i) {
            this.bitField0_ |= 128;
            this.positionInSetup_ = i;
        }

        private void setProductCode(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.productCode_ = str;
        }

        private void setProductCodeBytes(ByteString byteString) {
            this.productCode_ = byteString.r();
            this.bitField0_ |= 4;
        }

        private void setTmds(int i) {
            this.bitField0_ |= 8192;
            this.tmds_ = i;
        }

        private void setVerticalResolution(int i) {
            this.bitField0_ |= 64;
            this.verticalResolution_ = i;
        }

        private void setYuv420Support(boolean z) {
            this.bitField0_ |= 262144;
            this.yuv420Support_ = z;
        }

        private void setYuvSupport(boolean z) {
            this.bitField0_ |= 131072;
            this.yuvSupport_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExternalAudioVideoDevice();
                case 2:
                    return new s0();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ࠞ\u0005င\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\t\u001b\nင\u0007\u000bဇ\b\fင\t\r\u001b\u000eင\n\u000f᠌\u000b\u0010င\f\u0011င\r\u0012ဇ\u000e\u0013ဇ\u000f\u0014င\u0010\u0015ဇ\u0011\u0016ဇ\u0012\u0017င\u0013\u0018င\u0014", new Object[]{"bitField0_", "manufacturerName_", "modelName_", "productCode_", "avDeviceType_", l0.a, "manufactureYear_", "manufactureWeek_", "horizontalResolution_", "verticalResolution_", "audioDescription_", AudioDescription.class, "positionInSetup_", "isInPathToTv_", "cecVersion_", "cecCommand_", a.class, "frameRate_", "colorEncoding_", w0.a, "bitDepth_", "tmds_", "hdr10Support_", "dolbyVisionSupport_", "eotfSupport_", "yuvSupport_", "yuv420Support_", "maximumSupportedHdcpVersion_", "currentHdcpVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (ExternalAudioVideoDevice.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public AudioDescription getAudioDescription(int i) {
            return (AudioDescription) this.audioDescription_.get(i);
        }

        public int getAudioDescriptionCount() {
            return this.audioDescription_.size();
        }

        public List<AudioDescription> getAudioDescriptionList() {
            return this.audioDescription_;
        }

        public r0 getAudioDescriptionOrBuilder(int i) {
            return (r0) this.audioDescription_.get(i);
        }

        public List<? extends r0> getAudioDescriptionOrBuilderList() {
            return this.audioDescription_;
        }

        public AVDeviceType getAvDeviceType(int i) {
            AVDeviceType a2 = AVDeviceType.a(((o5w) this.avDeviceType_).e(i));
            return a2 == null ? AVDeviceType.AV_DEVICE_TYPE_UNKNOWN : a2;
        }

        public int getAvDeviceTypeCount() {
            return this.avDeviceType_.size();
        }

        public List<AVDeviceType> getAvDeviceTypeList() {
            return new lqw(this.avDeviceType_, avDeviceType_converter_);
        }

        public int getBitDepth() {
            return this.bitDepth_;
        }

        public a getCecCommand(int i) {
            return (a) this.cecCommand_.get(i);
        }

        public int getCecCommandCount() {
            return this.cecCommand_.size();
        }

        public List<a> getCecCommandList() {
            return this.cecCommand_;
        }

        public u0 getCecCommandOrBuilder(int i) {
            return (u0) this.cecCommand_.get(i);
        }

        public List<? extends u0> getCecCommandOrBuilderList() {
            return this.cecCommand_;
        }

        public int getCecVersion() {
            return this.cecVersion_;
        }

        public ColorEncoding getColorEncoding() {
            ColorEncoding a2 = ColorEncoding.a(this.colorEncoding_);
            return a2 == null ? ColorEncoding.COLOR_ENCODING_UNKNOWN : a2;
        }

        public int getCurrentHdcpVersion() {
            return this.currentHdcpVersion_;
        }

        public boolean getDolbyVisionSupport() {
            return this.dolbyVisionSupport_;
        }

        public int getEotfSupport() {
            return this.eotfSupport_;
        }

        public int getFrameRate() {
            return this.frameRate_;
        }

        public boolean getHdr10Support() {
            return this.hdr10Support_;
        }

        public int getHorizontalResolution() {
            return this.horizontalResolution_;
        }

        public boolean getIsInPathToTv() {
            return this.isInPathToTv_;
        }

        public int getManufactureWeek() {
            return this.manufactureWeek_;
        }

        public int getManufactureYear() {
            return this.manufactureYear_;
        }

        public String getManufacturerName() {
            return this.manufacturerName_;
        }

        public ByteString getManufacturerNameBytes() {
            return ByteString.g(this.manufacturerName_);
        }

        public int getMaximumSupportedHdcpVersion() {
            return this.maximumSupportedHdcpVersion_;
        }

        public String getModelName() {
            return this.modelName_;
        }

        public ByteString getModelNameBytes() {
            return ByteString.g(this.modelName_);
        }

        public int getPositionInSetup() {
            return this.positionInSetup_;
        }

        public String getProductCode() {
            return this.productCode_;
        }

        public ByteString getProductCodeBytes() {
            return ByteString.g(this.productCode_);
        }

        public int getTmds() {
            return this.tmds_;
        }

        public int getVerticalResolution() {
            return this.verticalResolution_;
        }

        public boolean getYuv420Support() {
            return this.yuv420Support_;
        }

        public boolean getYuvSupport() {
            return this.yuvSupport_;
        }

        public boolean hasBitDepth() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasCecVersion() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasColorEncoding() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasCurrentHdcpVersion() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasDolbyVisionSupport() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasEotfSupport() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasFrameRate() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasHdr10Support() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasHorizontalResolution() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasIsInPathToTv() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasManufactureWeek() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasManufactureYear() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasManufacturerName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMaximumSupportedHdcpVersion() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasModelName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPositionInSetup() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasProductCode() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTmds() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasVerticalResolution() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasYuv420Support() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasYuvSupport() {
            return (this.bitField0_ & 131072) != 0;
        }

        /* loaded from: classes2.dex */
        public static final class AudioDescription extends GeneratedMessageLite implements r0 {
            public static final int AUDIO_FORMAT_FIELD_NUMBER = 1;
            public static final int BIT_DEPTH_FIELD_NUMBER = 5;
            private static final AudioDescription DEFAULT_INSTANCE;
            public static final int MAX_BIT_RATE_PER_SECOND_FIELD_NUMBER = 4;
            public static final int NUM_CHANNELS_FIELD_NUMBER = 2;
            public static final int OUTPUT_MODE_FIELD_NUMBER = 6;
            private static volatile of90 PARSER = null;
            public static final int SAMPLE_FREQUENCY_HZ_FIELD_NUMBER = 3;
            private int audioFormat_;
            private int bitDepth_;
            private int bitField0_;
            private int maxBitRatePerSecond_;
            private int numChannels_;
            private int outputMode_;
            private jqw sampleFrequencyHz_ = GeneratedMessageLite.emptyIntList();

            public enum AudioFormat implements dqw {
                AUDIO_FORMAT_UNKNOWN(0),
                AUDIO_FORMAT_LPCM(1),
                AUDIO_FORMAT_AC_3(2),
                AUDIO_FORMAT_MPEG1(3),
                AUDIO_FORMAT_MP3(4),
                AUDIO_FORMAT_MPEG2(5),
                AUDIO_FORMAT_AAC(6),
                AUDIO_FORMAT_DTS(7),
                AUDIO_FORMAT_ATRAC(8),
                AUDIO_FORMAT_ONE_BIT(9),
                AUDIO_FORMAT_DD_PLUS(10),
                AUDIO_FORMAT_DTS_HD(11),
                AUDIO_FORMAT_MLP_DOLBY_TRUEHD(12),
                AUDIO_FORMAT_DST_AUDIO(13),
                AUDIO_FORMAT_MICROSOFT_WMA_PRO(14);

                public static final int AUDIO_FORMAT_AAC_VALUE = 6;
                public static final int AUDIO_FORMAT_AC_3_VALUE = 2;
                public static final int AUDIO_FORMAT_ATRAC_VALUE = 8;
                public static final int AUDIO_FORMAT_DD_PLUS_VALUE = 10;
                public static final int AUDIO_FORMAT_DST_AUDIO_VALUE = 13;
                public static final int AUDIO_FORMAT_DTS_HD_VALUE = 11;
                public static final int AUDIO_FORMAT_DTS_VALUE = 7;
                public static final int AUDIO_FORMAT_LPCM_VALUE = 1;
                public static final int AUDIO_FORMAT_MICROSOFT_WMA_PRO_VALUE = 14;
                public static final int AUDIO_FORMAT_MLP_DOLBY_TRUEHD_VALUE = 12;
                public static final int AUDIO_FORMAT_MP3_VALUE = 4;
                public static final int AUDIO_FORMAT_MPEG1_VALUE = 3;
                public static final int AUDIO_FORMAT_MPEG2_VALUE = 5;
                public static final int AUDIO_FORMAT_ONE_BIT_VALUE = 9;
                public static final int AUDIO_FORMAT_UNKNOWN_VALUE = 0;
                private static final fqw internalValueMap = new m0();
                private final int value;

                AudioFormat(int i) {
                    this.value = i;
                }

                public static AudioFormat a(int i) {
                    switch (i) {
                        case 0:
                            return AUDIO_FORMAT_UNKNOWN;
                        case 1:
                            return AUDIO_FORMAT_LPCM;
                        case 2:
                            return AUDIO_FORMAT_AC_3;
                        case 3:
                            return AUDIO_FORMAT_MPEG1;
                        case 4:
                            return AUDIO_FORMAT_MP3;
                        case 5:
                            return AUDIO_FORMAT_MPEG2;
                        case 6:
                            return AUDIO_FORMAT_AAC;
                        case 7:
                            return AUDIO_FORMAT_DTS;
                        case 8:
                            return AUDIO_FORMAT_ATRAC;
                        case 9:
                            return AUDIO_FORMAT_ONE_BIT;
                        case 10:
                            return AUDIO_FORMAT_DD_PLUS;
                        case 11:
                            return AUDIO_FORMAT_DTS_HD;
                        case 12:
                            return AUDIO_FORMAT_MLP_DOLBY_TRUEHD;
                        case 13:
                            return AUDIO_FORMAT_DST_AUDIO;
                        case 14:
                            return AUDIO_FORMAT_MICROSOFT_WMA_PRO;
                        default:
                            return null;
                    }
                }

                @Override // defpackage.dqw
                public final int getNumber() {
                    return this.value;
                }
            }

            public enum OutputMode implements dqw {
                ANALOG(0),
                DIGITAL(1);

                public static final int ANALOG_VALUE = 0;
                public static final int DIGITAL_VALUE = 1;
                private static final fqw internalValueMap = new p0();
                private final int value;

                OutputMode(int i) {
                    this.value = i;
                }

                @Override // defpackage.dqw
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                AudioDescription audioDescription = new AudioDescription();
                DEFAULT_INSTANCE = audioDescription;
                GeneratedMessageLite.registerDefaultInstance(AudioDescription.class, audioDescription);
            }

            private AudioDescription() {
            }

            private void addAllSampleFrequencyHz(Iterable<? extends Integer> iterable) {
                ensureSampleFrequencyHzIsMutable();
                com.google.protobuf.b.addAll(iterable, this.sampleFrequencyHz_);
            }

            private void addSampleFrequencyHz(int i) {
                ensureSampleFrequencyHzIsMutable();
                ((o5w) this.sampleFrequencyHz_).b(i);
            }

            private void clearAudioFormat() {
                this.bitField0_ &= -2;
                this.audioFormat_ = 0;
            }

            private void clearBitDepth() {
                this.bitField0_ &= -9;
                this.bitDepth_ = 0;
            }

            private void clearMaxBitRatePerSecond() {
                this.bitField0_ &= -5;
                this.maxBitRatePerSecond_ = 0;
            }

            private void clearNumChannels() {
                this.bitField0_ &= -3;
                this.numChannels_ = 0;
            }

            private void clearOutputMode() {
                this.bitField0_ &= -17;
                this.outputMode_ = 0;
            }

            private void clearSampleFrequencyHz() {
                this.sampleFrequencyHz_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void ensureSampleFrequencyHzIsMutable() {
                jqw jqwVar = this.sampleFrequencyHz_;
                if (((p9) jqwVar).a) {
                    return;
                }
                this.sampleFrequencyHz_ = GeneratedMessageLite.mutableCopy(jqwVar);
            }

            public static AudioDescription getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static o0 newBuilder() {
                return (o0) DEFAULT_INSTANCE.createBuilder();
            }

            public static AudioDescription parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AudioDescription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AudioDescription parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAudioFormat(AudioFormat audioFormat) {
                this.audioFormat_ = audioFormat.getNumber();
                this.bitField0_ |= 1;
            }

            private void setBitDepth(int i) {
                this.bitField0_ |= 8;
                this.bitDepth_ = i;
            }

            private void setMaxBitRatePerSecond(int i) {
                this.bitField0_ |= 4;
                this.maxBitRatePerSecond_ = i;
            }

            private void setNumChannels(int i) {
                this.bitField0_ |= 2;
                this.numChannels_ = i;
            }

            private void setOutputMode(OutputMode outputMode) {
                this.outputMode_ = outputMode.getNumber();
                this.bitField0_ |= 16;
            }

            private void setSampleFrequencyHz(int i, int i2) {
                ensureSampleFrequencyHzIsMutable();
                ((o5w) this.sampleFrequencyHz_).g(i, i2);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AudioDescription();
                    case 2:
                        return new o0(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u0016\u0004င\u0002\u0005င\u0003\u0006᠌\u0004", new Object[]{"bitField0_", "audioFormat_", n0.a, "numChannels_", "sampleFrequencyHz_", "maxBitRatePerSecond_", "bitDepth_", "outputMode_", q0.a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (AudioDescription.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public AudioFormat getAudioFormat() {
                AudioFormat a = AudioFormat.a(this.audioFormat_);
                return a == null ? AudioFormat.AUDIO_FORMAT_UNKNOWN : a;
            }

            public int getBitDepth() {
                return this.bitDepth_;
            }

            public int getMaxBitRatePerSecond() {
                return this.maxBitRatePerSecond_;
            }

            public int getNumChannels() {
                return this.numChannels_;
            }

            public OutputMode getOutputMode() {
                int i = this.outputMode_;
                OutputMode outputMode = i != 0 ? i != 1 ? null : OutputMode.DIGITAL : OutputMode.ANALOG;
                return outputMode == null ? OutputMode.ANALOG : outputMode;
            }

            public int getSampleFrequencyHz(int i) {
                return ((o5w) this.sampleFrequencyHz_).e(i);
            }

            public int getSampleFrequencyHzCount() {
                return this.sampleFrequencyHz_.size();
            }

            public List<Integer> getSampleFrequencyHzList() {
                return this.sampleFrequencyHz_;
            }

            public boolean hasAudioFormat() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasBitDepth() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasMaxBitRatePerSecond() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasNumChannels() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOutputMode() {
                return (this.bitField0_ & 16) != 0;
            }

            public static o0 newBuilder(AudioDescription audioDescription) {
                return (o0) DEFAULT_INSTANCE.createBuilder(audioDescription);
            }

            public static AudioDescription parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (AudioDescription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static AudioDescription parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static AudioDescription parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AudioDescription parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static AudioDescription parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AudioDescription parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static AudioDescription parseFrom(InputStream inputStream) throws IOException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AudioDescription parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static AudioDescription parseFrom(eac eacVar) throws IOException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static AudioDescription parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (AudioDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite implements u0 {
            private static final a DEFAULT_INSTANCE;
            public static final int NUM_ABORTED_UNKNOWN_REASON_FIELD_NUMBER = 6;
            public static final int NUM_ABORTED_UNRECOGNIZED_FIELD_NUMBER = 7;
            public static final int NUM_RECEIVED_BROADCAST_FIELD_NUMBER = 3;
            public static final int NUM_RECEIVED_DIRECT_FIELD_NUMBER = 2;
            public static final int NUM_SENT_BROADCAST_FIELD_NUMBER = 5;
            public static final int NUM_SENT_DIRECT_FIELD_NUMBER = 4;
            public static final int OPCODE_FIELD_NUMBER = 1;
            private static volatile of90 PARSER;
            private int bitField0_;
            private int numAbortedUnknownReason_;
            private int numAbortedUnrecognized_;
            private int numReceivedBroadcast_;
            private int numReceivedDirect_;
            private int numSentBroadcast_;
            private int numSentDirect_;
            private int opcode_;

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearNumAbortedUnknownReason() {
                this.bitField0_ &= -33;
                this.numAbortedUnknownReason_ = 0;
            }

            private void clearNumAbortedUnrecognized() {
                this.bitField0_ &= -65;
                this.numAbortedUnrecognized_ = 0;
            }

            private void clearNumReceivedBroadcast() {
                this.bitField0_ &= -5;
                this.numReceivedBroadcast_ = 0;
            }

            private void clearNumReceivedDirect() {
                this.bitField0_ &= -3;
                this.numReceivedDirect_ = 0;
            }

            private void clearNumSentBroadcast() {
                this.bitField0_ &= -17;
                this.numSentBroadcast_ = 0;
            }

            private void clearNumSentDirect() {
                this.bitField0_ &= -9;
                this.numSentDirect_ = 0;
            }

            private void clearOpcode() {
                this.bitField0_ &= -2;
                this.opcode_ = 0;
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static t0 newBuilder() {
                return (t0) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setNumAbortedUnknownReason(int i) {
                this.bitField0_ |= 32;
                this.numAbortedUnknownReason_ = i;
            }

            private void setNumAbortedUnrecognized(int i) {
                this.bitField0_ |= 64;
                this.numAbortedUnrecognized_ = i;
            }

            private void setNumReceivedBroadcast(int i) {
                this.bitField0_ |= 4;
                this.numReceivedBroadcast_ = i;
            }

            private void setNumReceivedDirect(int i) {
                this.bitField0_ |= 2;
                this.numReceivedDirect_ = i;
            }

            private void setNumSentBroadcast(int i) {
                this.bitField0_ |= 16;
                this.numSentBroadcast_ = i;
            }

            private void setNumSentDirect(int i) {
                this.bitField0_ |= 8;
                this.numSentDirect_ = i;
            }

            private void setOpcode(int i) {
                this.bitField0_ |= 1;
                this.opcode_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new t0(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "opcode_", "numReceivedDirect_", "numReceivedBroadcast_", "numSentDirect_", "numSentBroadcast_", "numAbortedUnknownReason_", "numAbortedUnrecognized_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (a.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public int getNumAbortedUnknownReason() {
                return this.numAbortedUnknownReason_;
            }

            public int getNumAbortedUnrecognized() {
                return this.numAbortedUnrecognized_;
            }

            public int getNumReceivedBroadcast() {
                return this.numReceivedBroadcast_;
            }

            public int getNumReceivedDirect() {
                return this.numReceivedDirect_;
            }

            public int getNumSentBroadcast() {
                return this.numSentBroadcast_;
            }

            public int getNumSentDirect() {
                return this.numSentDirect_;
            }

            public int getOpcode() {
                return this.opcode_;
            }

            public boolean hasNumAbortedUnknownReason() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasNumAbortedUnrecognized() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasNumReceivedBroadcast() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasNumReceivedDirect() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasNumSentBroadcast() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasNumSentDirect() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasOpcode() {
                return (this.bitField0_ & 1) != 0;
            }

            public static t0 newBuilder(a aVar) {
                return (t0) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static a parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static a parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static a parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(eac eacVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static a parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        public static s0 newBuilder(ExternalAudioVideoDevice externalAudioVideoDevice) {
            return (s0) DEFAULT_INSTANCE.createBuilder(externalAudioVideoDevice);
        }

        public static ExternalAudioVideoDevice parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static ExternalAudioVideoDevice parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static ExternalAudioVideoDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExternalAudioVideoDevice parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        private void addAudioDescription(int i, AudioDescription audioDescription) {
            audioDescription.getClass();
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.add(i, audioDescription);
        }

        private void addCecCommand(int i, a aVar) {
            aVar.getClass();
            ensureCecCommandIsMutable();
            this.cecCommand_.add(i, aVar);
        }

        public static ExternalAudioVideoDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExternalAudioVideoDevice parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static ExternalAudioVideoDevice parseFrom(InputStream inputStream) throws IOException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalAudioVideoDevice parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static ExternalAudioVideoDevice parseFrom(eac eacVar) throws IOException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static ExternalAudioVideoDevice parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (ExternalAudioVideoDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class GoogleUpdate extends GeneratedMessageLite implements zt10 {
        public static final int CLIENT_STATUS_FIELD_NUMBER = 5;
        private static final GoogleUpdate DEFAULT_INSTANCE;
        public static final int GOOGLE_UPDATE_STATUS_FIELD_NUMBER = 4;
        public static final int IS_SYSTEM_INSTALL_FIELD_NUMBER = 1;
        public static final int LAST_AUTOMATIC_START_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int LAST_UPDATE_CHECK_TIMESTAMP_FIELD_NUMBER = 3;
        private static volatile of90 PARSER;
        private int bitField0_;
        private ProductInfo clientStatus_;
        private ProductInfo googleUpdateStatus_;
        private boolean isSystemInstall_;
        private long lastAutomaticStartTimestamp_;
        private long lastUpdateCheckTimestamp_;

        static {
            GoogleUpdate googleUpdate = new GoogleUpdate();
            DEFAULT_INSTANCE = googleUpdate;
            GeneratedMessageLite.registerDefaultInstance(GoogleUpdate.class, googleUpdate);
        }

        private GoogleUpdate() {
        }

        private void clearClientStatus() {
            this.clientStatus_ = null;
            this.bitField0_ &= -17;
        }

        private void clearGoogleUpdateStatus() {
            this.googleUpdateStatus_ = null;
            this.bitField0_ &= -9;
        }

        private void clearIsSystemInstall() {
            this.bitField0_ &= -2;
            this.isSystemInstall_ = false;
        }

        private void clearLastAutomaticStartTimestamp() {
            this.bitField0_ &= -3;
            this.lastAutomaticStartTimestamp_ = 0L;
        }

        private void clearLastUpdateCheckTimestamp() {
            this.bitField0_ &= -5;
            this.lastUpdateCheckTimestamp_ = 0L;
        }

        public static GoogleUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeClientStatus(ProductInfo productInfo) {
            productInfo.getClass();
            ProductInfo productInfo2 = this.clientStatus_;
            if (productInfo2 == null || productInfo2 == ProductInfo.getDefaultInstance()) {
                this.clientStatus_ = productInfo;
            } else {
                this.clientStatus_ = (ProductInfo) ((a1) ProductInfo.newBuilder(this.clientStatus_).mergeFrom((GeneratedMessageLite) productInfo)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeGoogleUpdateStatus(ProductInfo productInfo) {
            productInfo.getClass();
            ProductInfo productInfo2 = this.googleUpdateStatus_;
            if (productInfo2 == null || productInfo2 == ProductInfo.getDefaultInstance()) {
                this.googleUpdateStatus_ = productInfo;
            } else {
                this.googleUpdateStatus_ = (ProductInfo) ((a1) ProductInfo.newBuilder(this.googleUpdateStatus_).mergeFrom((GeneratedMessageLite) productInfo)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static z0 newBuilder() {
            return (z0) DEFAULT_INSTANCE.createBuilder();
        }

        public static GoogleUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GoogleUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GoogleUpdate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClientStatus(ProductInfo productInfo) {
            productInfo.getClass();
            this.clientStatus_ = productInfo;
            this.bitField0_ |= 16;
        }

        private void setGoogleUpdateStatus(ProductInfo productInfo) {
            productInfo.getClass();
            this.googleUpdateStatus_ = productInfo;
            this.bitField0_ |= 8;
        }

        private void setIsSystemInstall(boolean z) {
            this.bitField0_ |= 1;
            this.isSystemInstall_ = z;
        }

        private void setLastAutomaticStartTimestamp(long j) {
            this.bitField0_ |= 2;
            this.lastAutomaticStartTimestamp_ = j;
        }

        private void setLastUpdateCheckTimestamp(long j) {
            this.bitField0_ |= 4;
            this.lastUpdateCheckTimestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GoogleUpdate();
                case 2:
                    return new z0(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "isSystemInstall_", "lastAutomaticStartTimestamp_", "lastUpdateCheckTimestamp_", "googleUpdateStatus_", "clientStatus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (GoogleUpdate.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public ProductInfo getClientStatus() {
            ProductInfo productInfo = this.clientStatus_;
            return productInfo == null ? ProductInfo.getDefaultInstance() : productInfo;
        }

        public ProductInfo getGoogleUpdateStatus() {
            ProductInfo productInfo = this.googleUpdateStatus_;
            return productInfo == null ? ProductInfo.getDefaultInstance() : productInfo;
        }

        public boolean getIsSystemInstall() {
            return this.isSystemInstall_;
        }

        public long getLastAutomaticStartTimestamp() {
            return this.lastAutomaticStartTimestamp_;
        }

        public long getLastUpdateCheckTimestamp() {
            return this.lastUpdateCheckTimestamp_;
        }

        public boolean hasClientStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasGoogleUpdateStatus() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIsSystemInstall() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLastAutomaticStartTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLastUpdateCheckTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        public static final class ProductInfo extends GeneratedMessageLite implements zt10 {
            private static final ProductInfo DEFAULT_INSTANCE;
            public static final int LAST_ERROR_FIELD_NUMBER = 4;
            public static final int LAST_EXTRA_ERROR_FIELD_NUMBER = 5;
            public static final int LAST_RESULT_FIELD_NUMBER = 3;
            public static final int LAST_UPDATE_SUCCESS_TIMESTAMP_FIELD_NUMBER = 2;
            private static volatile of90 PARSER = null;
            public static final int VERSION_FIELD_NUMBER = 1;
            private int bitField0_;
            private int lastError_;
            private int lastExtraError_;
            private int lastResult_;
            private long lastUpdateSuccessTimestamp_;
            private String version_ = "";

            public enum InstallResult implements dqw {
                INSTALL_RESULT_SUCCESS(0),
                INSTALL_RESULT_FAILED_CUSTOM_ERROR(1),
                INSTALL_RESULT_FAILED_MSI_ERROR(2),
                INSTALL_RESULT_FAILED_SYSTEM_ERROR(3),
                INSTALL_RESULT_EXIT_CODE(4);

                public static final int INSTALL_RESULT_EXIT_CODE_VALUE = 4;
                public static final int INSTALL_RESULT_FAILED_CUSTOM_ERROR_VALUE = 1;
                public static final int INSTALL_RESULT_FAILED_MSI_ERROR_VALUE = 2;
                public static final int INSTALL_RESULT_FAILED_SYSTEM_ERROR_VALUE = 3;
                public static final int INSTALL_RESULT_SUCCESS_VALUE = 0;
                private static final fqw internalValueMap = new b1();
                private final int value;

                InstallResult(int i) {
                    this.value = i;
                }

                public static InstallResult a(int i) {
                    if (i == 0) {
                        return INSTALL_RESULT_SUCCESS;
                    }
                    if (i == 1) {
                        return INSTALL_RESULT_FAILED_CUSTOM_ERROR;
                    }
                    if (i == 2) {
                        return INSTALL_RESULT_FAILED_MSI_ERROR;
                    }
                    if (i == 3) {
                        return INSTALL_RESULT_FAILED_SYSTEM_ERROR;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return INSTALL_RESULT_EXIT_CODE;
                }

                @Override // defpackage.dqw
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                ProductInfo productInfo = new ProductInfo();
                DEFAULT_INSTANCE = productInfo;
                GeneratedMessageLite.registerDefaultInstance(ProductInfo.class, productInfo);
            }

            private ProductInfo() {
            }

            private void clearLastError() {
                this.bitField0_ &= -9;
                this.lastError_ = 0;
            }

            private void clearLastExtraError() {
                this.bitField0_ &= -17;
                this.lastExtraError_ = 0;
            }

            private void clearLastResult() {
                this.bitField0_ &= -5;
                this.lastResult_ = 0;
            }

            private void clearLastUpdateSuccessTimestamp() {
                this.bitField0_ &= -3;
                this.lastUpdateSuccessTimestamp_ = 0L;
            }

            private void clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = getDefaultInstance().getVersion();
            }

            public static ProductInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a1 newBuilder() {
                return (a1) DEFAULT_INSTANCE.createBuilder();
            }

            public static ProductInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ProductInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ProductInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setLastError(int i) {
                this.bitField0_ |= 8;
                this.lastError_ = i;
            }

            private void setLastExtraError(int i) {
                this.bitField0_ |= 16;
                this.lastExtraError_ = i;
            }

            private void setLastResult(InstallResult installResult) {
                this.lastResult_ = installResult.getNumber();
                this.bitField0_ |= 4;
            }

            private void setLastUpdateSuccessTimestamp(long j) {
                this.bitField0_ |= 2;
                this.lastUpdateSuccessTimestamp_ = j;
            }

            private void setVersion(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.version_ = str;
            }

            private void setVersionBytes(ByteString byteString) {
                this.version_ = byteString.r();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ProductInfo();
                    case 2:
                        return new a1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "version_", "lastUpdateSuccessTimestamp_", "lastResult_", c1.a, "lastError_", "lastExtraError_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (ProductInfo.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public int getLastError() {
                return this.lastError_;
            }

            public int getLastExtraError() {
                return this.lastExtraError_;
            }

            public InstallResult getLastResult() {
                InstallResult a = InstallResult.a(this.lastResult_);
                return a == null ? InstallResult.INSTALL_RESULT_SUCCESS : a;
            }

            public long getLastUpdateSuccessTimestamp() {
                return this.lastUpdateSuccessTimestamp_;
            }

            public String getVersion() {
                return this.version_;
            }

            public ByteString getVersionBytes() {
                return ByteString.g(this.version_);
            }

            public boolean hasLastError() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasLastExtraError() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasLastResult() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasLastUpdateSuccessTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            public static a1 newBuilder(ProductInfo productInfo) {
                return (a1) DEFAULT_INSTANCE.createBuilder(productInfo);
            }

            public static ProductInfo parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (ProductInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static ProductInfo parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static ProductInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ProductInfo parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static ProductInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ProductInfo parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static ProductInfo parseFrom(InputStream inputStream) throws IOException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ProductInfo parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static ProductInfo parseFrom(eac eacVar) throws IOException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static ProductInfo parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (ProductInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        public static z0 newBuilder(GoogleUpdate googleUpdate) {
            return (z0) DEFAULT_INSTANCE.createBuilder(googleUpdate);
        }

        public static GoogleUpdate parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (GoogleUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static GoogleUpdate parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static GoogleUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GoogleUpdate parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static GoogleUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GoogleUpdate parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static GoogleUpdate parseFrom(InputStream inputStream) throws IOException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GoogleUpdate parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static GoogleUpdate parseFrom(eac eacVar) throws IOException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static GoogleUpdate parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (GoogleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class Hardware extends GeneratedMessageLite implements zt10 {
        public static final int APP_CPU_ARCHITECTURE_FIELD_NUMBER = 21;
        public static final int APP_DRIVE_FIELD_NUMBER = 16;
        public static final int CELLULAR_DEVICE_VARIANT_FIELD_NUMBER = 24;
        public static final int CPU_ARCHITECTURE_FIELD_NUMBER = 1;
        public static final int CPU_FIELD_NUMBER = 13;
        private static final Hardware DEFAULT_INSTANCE;
        public static final int DLL_BASE_FIELD_NUMBER = 3;
        public static final int FORM_FACTOR_FIELD_NUMBER = 22;
        public static final int FULL_HARDWARE_CLASS_FIELD_NUMBER = 18;
        public static final int GPU_FIELD_NUMBER = 8;
        public static final int HARDWARE_CLASS_FIELD_NUMBER = 4;
        public static final int INTERNAL_DISPLAY_SUPPORTS_TOUCH_FIELD_NUMBER = 14;
        public static final int INTERNAL_STORAGE_DEVICES_FIELD_NUMBER = 20;
        public static final int MAX_DPI_X_FIELD_NUMBER = 9;
        public static final int MAX_DPI_Y_FIELD_NUMBER = 10;
        public static final int MOTHERBOARD_FIELD_NUMBER = 25;
        private static volatile of90 PARSER = null;
        public static final int PRIMARY_SCREEN_HEIGHT_FIELD_NUMBER = 7;
        public static final int PRIMARY_SCREEN_SCALE_FACTOR_FIELD_NUMBER = 12;
        public static final int PRIMARY_SCREEN_WIDTH_FIELD_NUMBER = 6;
        public static final int SCREEN_COUNT_FIELD_NUMBER = 5;
        public static final int SYSTEM_RAM_MB_FIELD_NUMBER = 2;
        public static final int TPM_FIRMWARE_VERSION_FIELD_NUMBER = 26;
        public static final int TPM_RW_FIRMWARE_VERSION_FIELD_NUMBER = 27;
        public static final int TPM_TYPE_FIELD_NUMBER = 23;
        public static final int USER_DATA_DRIVE_FIELD_NUMBER = 17;
        private b appDrive_;
        private int bitField0_;
        private a cpu_;
        private long dllBase_;
        private int formFactor_;
        private c gpu_;
        private boolean internalDisplaySupportsTouch_;
        private float maxDpiX_;
        private float maxDpiY_;
        private d motherboard_;
        private int primaryScreenHeight_;
        private float primaryScreenScaleFactor_;
        private int primaryScreenWidth_;
        private int screenCount_;
        private long systemRamMb_;
        private long tpmFirmwareVersion_;
        private int tpmType_;
        private b userDataDrive_;
        private String cpuArchitecture_ = "";
        private String appCpuArchitecture_ = "";
        private String hardwareClass_ = "";
        private String fullHardwareClass_ = "";
        private String cellularDeviceVariant_ = "";
        private oqw internalStorageDevices_ = GeneratedMessageLite.emptyProtobufList();
        private String tpmRwFirmwareVersion_ = "";

        /* loaded from: classes2.dex */
        public enum BiosType implements dqw {
            BIOS_TYPE_UNKNOWN(0),
            BIOS_TYPE_LEGACY(1),
            BIOS_TYPE_UEFI(2);

            public static final int BIOS_TYPE_LEGACY_VALUE = 1;
            public static final int BIOS_TYPE_UEFI_VALUE = 2;
            public static final int BIOS_TYPE_UNKNOWN_VALUE = 0;
            private static final fqw internalValueMap = new d1();
            private final int value;

            BiosType(int i) {
                this.value = i;
            }

            public static BiosType a(int i) {
                if (i == 0) {
                    return BIOS_TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return BIOS_TYPE_LEGACY;
                }
                if (i != 2) {
                    return null;
                }
                return BIOS_TYPE_UEFI;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum FormFactor implements dqw {
            FORM_FACTOR_UNKNOWN(0),
            FORM_FACTOR_DESKTOP(1),
            FORM_FACTOR_PHONE(2),
            FORM_FACTOR_TABLET(3),
            FORM_FACTOR_TV(4),
            FORM_FACTOR_MEET_DEVICE(5),
            FORM_FACTOR_AUTOMOTIVE(6),
            FORM_FACTOR_FOLDABLE(7);

            public static final int FORM_FACTOR_AUTOMOTIVE_VALUE = 6;
            public static final int FORM_FACTOR_DESKTOP_VALUE = 1;
            public static final int FORM_FACTOR_FOLDABLE_VALUE = 7;
            public static final int FORM_FACTOR_MEET_DEVICE_VALUE = 5;
            public static final int FORM_FACTOR_PHONE_VALUE = 2;
            public static final int FORM_FACTOR_TABLET_VALUE = 3;
            public static final int FORM_FACTOR_TV_VALUE = 4;
            public static final int FORM_FACTOR_UNKNOWN_VALUE = 0;
            private static final fqw internalValueMap = new i1();
            private final int value;

            FormFactor(int i) {
                this.value = i;
            }

            public static FormFactor a(int i) {
                switch (i) {
                    case 0:
                        return FORM_FACTOR_UNKNOWN;
                    case 1:
                        return FORM_FACTOR_DESKTOP;
                    case 2:
                        return FORM_FACTOR_PHONE;
                    case 3:
                        return FORM_FACTOR_TABLET;
                    case 4:
                        return FORM_FACTOR_TV;
                    case 5:
                        return FORM_FACTOR_MEET_DEVICE;
                    case 6:
                        return FORM_FACTOR_AUTOMOTIVE;
                    case 7:
                        return FORM_FACTOR_FOLDABLE;
                    default:
                        return null;
                }
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum TpmType implements dqw {
            TPM_TYPE_UNKNOWN(0),
            TPM_TYPE_1(1),
            TPM_TYPE_CR50(2),
            TPM_TYPE_TI50(3),
            TPM_TYPE_RUNTIME_SELECTION(4),
            TPM_TYPE_GENERIC_2(5);

            public static final int TPM_TYPE_1_VALUE = 1;
            public static final int TPM_TYPE_CR50_VALUE = 2;
            public static final int TPM_TYPE_GENERIC_2_VALUE = 5;
            public static final int TPM_TYPE_RUNTIME_SELECTION_VALUE = 4;
            public static final int TPM_TYPE_TI50_VALUE = 3;
            public static final int TPM_TYPE_UNKNOWN_VALUE = 0;
            private static final fqw internalValueMap = new s1();
            private final int value;

            TpmType(int i) {
                this.value = i;
            }

            public static TpmType a(int i) {
                if (i == 0) {
                    return TPM_TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return TPM_TYPE_1;
                }
                if (i == 2) {
                    return TPM_TYPE_CR50;
                }
                if (i == 3) {
                    return TPM_TYPE_TI50;
                }
                if (i == 4) {
                    return TPM_TYPE_RUNTIME_SELECTION;
                }
                if (i != 5) {
                    return null;
                }
                return TPM_TYPE_GENERIC_2;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Hardware hardware = new Hardware();
            DEFAULT_INSTANCE = hardware;
            GeneratedMessageLite.registerDefaultInstance(Hardware.class, hardware);
        }

        private Hardware() {
        }

        private void addAllInternalStorageDevices(Iterable<? extends InternalStorageDevice> iterable) {
            ensureInternalStorageDevicesIsMutable();
            com.google.protobuf.b.addAll(iterable, this.internalStorageDevices_);
        }

        private void addInternalStorageDevices(InternalStorageDevice internalStorageDevice) {
            internalStorageDevice.getClass();
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.add(internalStorageDevice);
        }

        private void clearAppCpuArchitecture() {
            this.bitField0_ &= -3;
            this.appCpuArchitecture_ = getDefaultInstance().getAppCpuArchitecture();
        }

        private void clearAppDrive() {
            this.appDrive_ = null;
            this.bitField0_ &= -262145;
        }

        private void clearCellularDeviceVariant() {
            this.bitField0_ &= -65;
            this.cellularDeviceVariant_ = getDefaultInstance().getCellularDeviceVariant();
        }

        private void clearCpu() {
            this.cpu_ = null;
            this.bitField0_ &= -16385;
        }

        private void clearCpuArchitecture() {
            this.bitField0_ &= -2;
            this.cpuArchitecture_ = getDefaultInstance().getCpuArchitecture();
        }

        private void clearDllBase() {
            this.bitField0_ &= -9;
            this.dllBase_ = 0L;
        }

        private void clearFormFactor() {
            this.bitField0_ &= -8193;
            this.formFactor_ = 0;
        }

        private void clearFullHardwareClass() {
            this.bitField0_ &= -33;
            this.fullHardwareClass_ = getDefaultInstance().getFullHardwareClass();
        }

        private void clearGpu() {
            this.gpu_ = null;
            this.bitField0_ &= -65537;
        }

        private void clearHardwareClass() {
            this.bitField0_ &= -17;
            this.hardwareClass_ = getDefaultInstance().getHardwareClass();
        }

        private void clearInternalDisplaySupportsTouch() {
            this.bitField0_ &= -131073;
            this.internalDisplaySupportsTouch_ = false;
        }

        private void clearInternalStorageDevices() {
            this.internalStorageDevices_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMaxDpiX() {
            this.bitField0_ &= -2049;
            this.maxDpiX_ = 0.0f;
        }

        private void clearMaxDpiY() {
            this.bitField0_ &= -4097;
            this.maxDpiY_ = 0.0f;
        }

        private void clearMotherboard() {
            this.motherboard_ = null;
            this.bitField0_ &= -32769;
        }

        private void clearPrimaryScreenHeight() {
            this.bitField0_ &= -513;
            this.primaryScreenHeight_ = 0;
        }

        private void clearPrimaryScreenScaleFactor() {
            this.bitField0_ &= -1025;
            this.primaryScreenScaleFactor_ = 0.0f;
        }

        private void clearPrimaryScreenWidth() {
            this.bitField0_ &= -257;
            this.primaryScreenWidth_ = 0;
        }

        private void clearScreenCount() {
            this.bitField0_ &= -129;
            this.screenCount_ = 0;
        }

        private void clearSystemRamMb() {
            this.bitField0_ &= -5;
            this.systemRamMb_ = 0L;
        }

        private void clearTpmFirmwareVersion() {
            this.bitField0_ &= -2097153;
            this.tpmFirmwareVersion_ = 0L;
        }

        private void clearTpmRwFirmwareVersion() {
            this.bitField0_ &= -4194305;
            this.tpmRwFirmwareVersion_ = getDefaultInstance().getTpmRwFirmwareVersion();
        }

        private void clearTpmType() {
            this.bitField0_ &= -1048577;
            this.tpmType_ = 0;
        }

        private void clearUserDataDrive() {
            this.userDataDrive_ = null;
            this.bitField0_ &= -524289;
        }

        private void ensureInternalStorageDevicesIsMutable() {
            oqw oqwVar = this.internalStorageDevices_;
            if (((p9) oqwVar).a) {
                return;
            }
            this.internalStorageDevices_ = GeneratedMessageLite.mutableCopy(oqwVar);
        }

        public static Hardware getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAppDrive(b bVar) {
            bVar.getClass();
            b bVar2 = this.appDrive_;
            if (bVar2 == null || bVar2 == b.getDefaultInstance()) {
                this.appDrive_ = bVar;
            } else {
                this.appDrive_ = (b) ((h1) b.newBuilder(this.appDrive_).mergeFrom((GeneratedMessageLite) bVar)).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        private void mergeCpu(a aVar) {
            aVar.getClass();
            a aVar2 = this.cpu_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.cpu_ = aVar;
            } else {
                this.cpu_ = (a) ((g1) a.newBuilder(this.cpu_).mergeFrom((GeneratedMessageLite) aVar)).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        private void mergeGpu(c cVar) {
            cVar.getClass();
            c cVar2 = this.gpu_;
            if (cVar2 == null || cVar2 == c.getDefaultInstance()) {
                this.gpu_ = cVar;
            } else {
                this.gpu_ = (c) ((k1) c.newBuilder(this.gpu_).mergeFrom((GeneratedMessageLite) cVar)).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        private void mergeMotherboard(d dVar) {
            dVar.getClass();
            d dVar2 = this.motherboard_;
            if (dVar2 == null || dVar2 == d.getDefaultInstance()) {
                this.motherboard_ = dVar;
            } else {
                this.motherboard_ = (d) ((r1) d.newBuilder(this.motherboard_).mergeFrom((GeneratedMessageLite) dVar)).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        private void mergeUserDataDrive(b bVar) {
            bVar.getClass();
            b bVar2 = this.userDataDrive_;
            if (bVar2 == null || bVar2 == b.getDefaultInstance()) {
                this.userDataDrive_ = bVar;
            } else {
                this.userDataDrive_ = (b) ((h1) b.newBuilder(this.userDataDrive_).mergeFrom((GeneratedMessageLite) bVar)).buildPartial();
            }
            this.bitField0_ |= 524288;
        }

        public static f1 newBuilder() {
            return (f1) DEFAULT_INSTANCE.createBuilder();
        }

        public static Hardware parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Hardware) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Hardware parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeInternalStorageDevices(int i) {
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.remove(i);
        }

        private void setAppCpuArchitecture(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.appCpuArchitecture_ = str;
        }

        private void setAppCpuArchitectureBytes(ByteString byteString) {
            this.appCpuArchitecture_ = byteString.r();
            this.bitField0_ |= 2;
        }

        private void setAppDrive(b bVar) {
            bVar.getClass();
            this.appDrive_ = bVar;
            this.bitField0_ |= 262144;
        }

        private void setCellularDeviceVariant(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.cellularDeviceVariant_ = str;
        }

        private void setCellularDeviceVariantBytes(ByteString byteString) {
            this.cellularDeviceVariant_ = byteString.r();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpu(a aVar) {
            aVar.getClass();
            this.cpu_ = aVar;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuArchitecture(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.cpuArchitecture_ = str;
        }

        private void setCpuArchitectureBytes(ByteString byteString) {
            this.cpuArchitecture_ = byteString.r();
            this.bitField0_ |= 1;
        }

        private void setDllBase(long j) {
            this.bitField0_ |= 8;
            this.dllBase_ = j;
        }

        private void setFormFactor(FormFactor formFactor) {
            this.formFactor_ = formFactor.getNumber();
            this.bitField0_ |= 8192;
        }

        private void setFullHardwareClass(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.fullHardwareClass_ = str;
        }

        private void setFullHardwareClassBytes(ByteString byteString) {
            this.fullHardwareClass_ = byteString.r();
            this.bitField0_ |= 32;
        }

        private void setGpu(c cVar) {
            cVar.getClass();
            this.gpu_ = cVar;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardwareClass(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.hardwareClass_ = str;
        }

        private void setHardwareClassBytes(ByteString byteString) {
            this.hardwareClass_ = byteString.r();
            this.bitField0_ |= 16;
        }

        private void setInternalDisplaySupportsTouch(boolean z) {
            this.bitField0_ |= 131072;
            this.internalDisplaySupportsTouch_ = z;
        }

        private void setInternalStorageDevices(int i, InternalStorageDevice internalStorageDevice) {
            internalStorageDevice.getClass();
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.set(i, internalStorageDevice);
        }

        private void setMaxDpiX(float f) {
            this.bitField0_ |= 2048;
            this.maxDpiX_ = f;
        }

        private void setMaxDpiY(float f) {
            this.bitField0_ |= 4096;
            this.maxDpiY_ = f;
        }

        private void setMotherboard(d dVar) {
            dVar.getClass();
            this.motherboard_ = dVar;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryScreenHeight(int i) {
            this.bitField0_ |= 512;
            this.primaryScreenHeight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryScreenScaleFactor(float f) {
            this.bitField0_ |= 1024;
            this.primaryScreenScaleFactor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryScreenWidth(int i) {
            this.bitField0_ |= 256;
            this.primaryScreenWidth_ = i;
        }

        private void setScreenCount(int i) {
            this.bitField0_ |= 128;
            this.screenCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemRamMb(long j) {
            this.bitField0_ |= 4;
            this.systemRamMb_ = j;
        }

        private void setTpmFirmwareVersion(long j) {
            this.bitField0_ |= 2097152;
            this.tpmFirmwareVersion_ = j;
        }

        private void setTpmRwFirmwareVersion(String str) {
            str.getClass();
            this.bitField0_ |= SelfTester_JCP.ENCRYPT_CBC;
            this.tpmRwFirmwareVersion_ = str;
        }

        private void setTpmRwFirmwareVersionBytes(ByteString byteString) {
            this.tpmRwFirmwareVersion_ = byteString.r();
            this.bitField0_ |= SelfTester_JCP.ENCRYPT_CBC;
        }

        private void setTpmType(TpmType tpmType) {
            this.tpmType_ = tpmType.getNumber();
            this.bitField0_ |= 1048576;
        }

        private void setUserDataDrive(b bVar) {
            bVar.getClass();
            this.userDataDrive_ = bVar;
            this.bitField0_ |= 524288;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Hardware();
                case 2:
                    return new f1(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဈ\u0004\u0005င\u0007\u0006င\b\u0007င\t\bဉ\u0010\tခ\u000b\nခ\f\fခ\n\rဉ\u000e\u000eဇ\u0011\u0010ဉ\u0012\u0011ဉ\u0013\u0012ဈ\u0005\u0014\u001b\u0015ဈ\u0001\u0016᠌\r\u0017᠌\u0014\u0018ဈ\u0006\u0019ဉ\u000f\u001aဃ\u0015\u001bဈ\u0016", new Object[]{"bitField0_", "cpuArchitecture_", "systemRamMb_", "dllBase_", "hardwareClass_", "screenCount_", "primaryScreenWidth_", "primaryScreenHeight_", "gpu_", "maxDpiX_", "maxDpiY_", "primaryScreenScaleFactor_", "cpu_", "internalDisplaySupportsTouch_", "appDrive_", "userDataDrive_", "fullHardwareClass_", "internalStorageDevices_", InternalStorageDevice.class, "appCpuArchitecture_", "formFactor_", j1.a, "tpmType_", t1.a, "cellularDeviceVariant_", "motherboard_", "tpmFirmwareVersion_", "tpmRwFirmwareVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (Hardware.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public String getAppCpuArchitecture() {
            return this.appCpuArchitecture_;
        }

        public ByteString getAppCpuArchitectureBytes() {
            return ByteString.g(this.appCpuArchitecture_);
        }

        public b getAppDrive() {
            b bVar = this.appDrive_;
            return bVar == null ? b.getDefaultInstance() : bVar;
        }

        public String getCellularDeviceVariant() {
            return this.cellularDeviceVariant_;
        }

        public ByteString getCellularDeviceVariantBytes() {
            return ByteString.g(this.cellularDeviceVariant_);
        }

        public a getCpu() {
            a aVar = this.cpu_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public String getCpuArchitecture() {
            return this.cpuArchitecture_;
        }

        public ByteString getCpuArchitectureBytes() {
            return ByteString.g(this.cpuArchitecture_);
        }

        public long getDllBase() {
            return this.dllBase_;
        }

        public FormFactor getFormFactor() {
            FormFactor a2 = FormFactor.a(this.formFactor_);
            return a2 == null ? FormFactor.FORM_FACTOR_UNKNOWN : a2;
        }

        public String getFullHardwareClass() {
            return this.fullHardwareClass_;
        }

        public ByteString getFullHardwareClassBytes() {
            return ByteString.g(this.fullHardwareClass_);
        }

        public c getGpu() {
            c cVar = this.gpu_;
            return cVar == null ? c.getDefaultInstance() : cVar;
        }

        public String getHardwareClass() {
            return this.hardwareClass_;
        }

        public ByteString getHardwareClassBytes() {
            return ByteString.g(this.hardwareClass_);
        }

        public boolean getInternalDisplaySupportsTouch() {
            return this.internalDisplaySupportsTouch_;
        }

        public InternalStorageDevice getInternalStorageDevices(int i) {
            return (InternalStorageDevice) this.internalStorageDevices_.get(i);
        }

        public int getInternalStorageDevicesCount() {
            return this.internalStorageDevices_.size();
        }

        public List<InternalStorageDevice> getInternalStorageDevicesList() {
            return this.internalStorageDevices_;
        }

        public q1 getInternalStorageDevicesOrBuilder(int i) {
            return (q1) this.internalStorageDevices_.get(i);
        }

        public List<? extends q1> getInternalStorageDevicesOrBuilderList() {
            return this.internalStorageDevices_;
        }

        public float getMaxDpiX() {
            return this.maxDpiX_;
        }

        public float getMaxDpiY() {
            return this.maxDpiY_;
        }

        public d getMotherboard() {
            d dVar = this.motherboard_;
            return dVar == null ? d.getDefaultInstance() : dVar;
        }

        public int getPrimaryScreenHeight() {
            return this.primaryScreenHeight_;
        }

        public float getPrimaryScreenScaleFactor() {
            return this.primaryScreenScaleFactor_;
        }

        public int getPrimaryScreenWidth() {
            return this.primaryScreenWidth_;
        }

        public int getScreenCount() {
            return this.screenCount_;
        }

        public long getSystemRamMb() {
            return this.systemRamMb_;
        }

        public long getTpmFirmwareVersion() {
            return this.tpmFirmwareVersion_;
        }

        public String getTpmRwFirmwareVersion() {
            return this.tpmRwFirmwareVersion_;
        }

        public ByteString getTpmRwFirmwareVersionBytes() {
            return ByteString.g(this.tpmRwFirmwareVersion_);
        }

        public TpmType getTpmType() {
            TpmType a2 = TpmType.a(this.tpmType_);
            return a2 == null ? TpmType.TPM_TYPE_UNKNOWN : a2;
        }

        public b getUserDataDrive() {
            b bVar = this.userDataDrive_;
            return bVar == null ? b.getDefaultInstance() : bVar;
        }

        public boolean hasAppCpuArchitecture() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasAppDrive() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasCellularDeviceVariant() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasCpu() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasCpuArchitecture() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDllBase() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFormFactor() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasFullHardwareClass() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasGpu() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasHardwareClass() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInternalDisplaySupportsTouch() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasMaxDpiX() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasMaxDpiY() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasMotherboard() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasPrimaryScreenHeight() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasPrimaryScreenScaleFactor() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasPrimaryScreenWidth() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasScreenCount() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSystemRamMb() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTpmFirmwareVersion() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasTpmRwFirmwareVersion() {
            return (this.bitField0_ & SelfTester_JCP.ENCRYPT_CBC) != 0;
        }

        public boolean hasTpmType() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasUserDataDrive() {
            return (this.bitField0_ & 524288) != 0;
        }

        public static final class InternalStorageDevice extends GeneratedMessageLite implements q1 {
            private static final InternalStorageDevice DEFAULT_INSTANCE;
            public static final int FIRMWARE_VERSION_FIELD_NUMBER = 6;
            public static final int MODEL_FIELD_NUMBER = 4;
            private static volatile of90 PARSER = null;
            public static final int PRODUCT_ID_FIELD_NUMBER = 2;
            public static final int PURPOSE_FIELD_NUMBER = 8;
            public static final int REVISION_FIELD_NUMBER = 3;
            public static final int SIZE_MB_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 7;
            public static final int VENDOR_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private long firmwareVersion_;
            private String model_ = "";
            private long productId_;
            private int purpose_;
            private int revision_;
            private int sizeMb_;
            private int type_;
            private int vendorId_;

            public enum Purpose implements dqw {
                PURPOSE_UNKNOWN(0),
                PURPOSE_BOOT(1),
                PURPOSE_SWAP(2),
                PURPOSE_BOOT_SWAP(3);

                public static final int PURPOSE_BOOT_SWAP_VALUE = 3;
                public static final int PURPOSE_BOOT_VALUE = 1;
                public static final int PURPOSE_SWAP_VALUE = 2;
                public static final int PURPOSE_UNKNOWN_VALUE = 0;
                private static final fqw internalValueMap = new m1();
                private final int value;

                Purpose(int i) {
                    this.value = i;
                }

                public static Purpose a(int i) {
                    if (i == 0) {
                        return PURPOSE_UNKNOWN;
                    }
                    if (i == 1) {
                        return PURPOSE_BOOT;
                    }
                    if (i == 2) {
                        return PURPOSE_SWAP;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return PURPOSE_BOOT_SWAP;
                }

                @Override // defpackage.dqw
                public final int getNumber() {
                    return this.value;
                }
            }

            public enum Type implements dqw {
                TYPE_UNKNOWN(0),
                TYPE_EMMC(1),
                TYPE_NVME(2),
                TYPE_UFS(3),
                TYPE_SD_EXPRESS_INTERNAL(4);

                public static final int TYPE_EMMC_VALUE = 1;
                public static final int TYPE_NVME_VALUE = 2;
                public static final int TYPE_SD_EXPRESS_INTERNAL_VALUE = 4;
                public static final int TYPE_UFS_VALUE = 3;
                public static final int TYPE_UNKNOWN_VALUE = 0;
                private static final fqw internalValueMap = new o1();
                private final int value;

                Type(int i) {
                    this.value = i;
                }

                public static Type a(int i) {
                    if (i == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (i == 1) {
                        return TYPE_EMMC;
                    }
                    if (i == 2) {
                        return TYPE_NVME;
                    }
                    if (i == 3) {
                        return TYPE_UFS;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return TYPE_SD_EXPRESS_INTERNAL;
                }

                @Override // defpackage.dqw
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                InternalStorageDevice internalStorageDevice = new InternalStorageDevice();
                DEFAULT_INSTANCE = internalStorageDevice;
                GeneratedMessageLite.registerDefaultInstance(InternalStorageDevice.class, internalStorageDevice);
            }

            private InternalStorageDevice() {
            }

            private void clearFirmwareVersion() {
                this.bitField0_ &= -33;
                this.firmwareVersion_ = 0L;
            }

            private void clearModel() {
                this.bitField0_ &= -9;
                this.model_ = getDefaultInstance().getModel();
            }

            private void clearProductId() {
                this.bitField0_ &= -3;
                this.productId_ = 0L;
            }

            private void clearPurpose() {
                this.bitField0_ &= -129;
                this.purpose_ = 0;
            }

            private void clearRevision() {
                this.bitField0_ &= -5;
                this.revision_ = 0;
            }

            private void clearSizeMb() {
                this.bitField0_ &= -17;
                this.sizeMb_ = 0;
            }

            private void clearType() {
                this.bitField0_ &= -65;
                this.type_ = 0;
            }

            private void clearVendorId() {
                this.bitField0_ &= -2;
                this.vendorId_ = 0;
            }

            public static InternalStorageDevice getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static l1 newBuilder() {
                return (l1) DEFAULT_INSTANCE.createBuilder();
            }

            public static InternalStorageDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (InternalStorageDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static InternalStorageDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFirmwareVersion(long j) {
                this.bitField0_ |= 32;
                this.firmwareVersion_ = j;
            }

            private void setModel(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.model_ = str;
            }

            private void setModelBytes(ByteString byteString) {
                this.model_ = byteString.r();
                this.bitField0_ |= 8;
            }

            private void setProductId(long j) {
                this.bitField0_ |= 2;
                this.productId_ = j;
            }

            private void setPurpose(Purpose purpose) {
                this.purpose_ = purpose.getNumber();
                this.bitField0_ |= 128;
            }

            private void setRevision(int i) {
                this.bitField0_ |= 4;
                this.revision_ = i;
            }

            private void setSizeMb(int i) {
                this.bitField0_ |= 16;
                this.sizeMb_ = i;
            }

            private void setType(Type type) {
                this.type_ = type.getNumber();
                this.bitField0_ |= 64;
            }

            private void setVendorId(int i) {
                this.bitField0_ |= 1;
                this.vendorId_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new InternalStorageDevice();
                    case 2:
                        return new l1();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဃ\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"bitField0_", "vendorId_", "productId_", "revision_", "model_", "sizeMb_", "firmwareVersion_", "type_", p1.a, "purpose_", n1.a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (InternalStorageDevice.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs(DEFAULT_INSTANCE);
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public long getFirmwareVersion() {
                return this.firmwareVersion_;
            }

            public String getModel() {
                return this.model_;
            }

            public ByteString getModelBytes() {
                return ByteString.g(this.model_);
            }

            public long getProductId() {
                return this.productId_;
            }

            public Purpose getPurpose() {
                Purpose a = Purpose.a(this.purpose_);
                return a == null ? Purpose.PURPOSE_UNKNOWN : a;
            }

            public int getRevision() {
                return this.revision_;
            }

            public int getSizeMb() {
                return this.sizeMb_;
            }

            public Type getType() {
                Type a = Type.a(this.type_);
                return a == null ? Type.TYPE_UNKNOWN : a;
            }

            public int getVendorId() {
                return this.vendorId_;
            }

            public boolean hasFirmwareVersion() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasModel() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasProductId() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPurpose() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasRevision() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSizeMb() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasType() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasVendorId() {
                return (this.bitField0_ & 1) != 0;
            }

            public static l1 newBuilder(InternalStorageDevice internalStorageDevice) {
                return (l1) DEFAULT_INSTANCE.createBuilder(internalStorageDevice);
            }

            public static InternalStorageDevice parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (InternalStorageDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static InternalStorageDevice parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static InternalStorageDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static InternalStorageDevice parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static InternalStorageDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static InternalStorageDevice parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static InternalStorageDevice parseFrom(InputStream inputStream) throws IOException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static InternalStorageDevice parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static InternalStorageDevice parseFrom(eac eacVar) throws IOException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static InternalStorageDevice parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (InternalStorageDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        public static final class a extends GeneratedMessageLite implements zt10 {
            private static final a DEFAULT_INSTANCE;
            public static final int IS_HYPERVISOR_FIELD_NUMBER = 4;
            public static final int NUM_CORES_FIELD_NUMBER = 3;
            public static final int NUM_EFFICIENT_CORES_FIELD_NUMBER = 5;
            private static volatile of90 PARSER = null;
            public static final int SIGNATURE_FIELD_NUMBER = 2;
            public static final int VENDOR_NAME_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean isHypervisor_;
            private int numCores_;
            private int numEfficientCores_;
            private int signature_;
            private String vendorName_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearIsHypervisor() {
                this.bitField0_ &= -17;
                this.isHypervisor_ = false;
            }

            private void clearNumCores() {
                this.bitField0_ &= -5;
                this.numCores_ = 0;
            }

            private void clearNumEfficientCores() {
                this.bitField0_ &= -9;
                this.numEfficientCores_ = 0;
            }

            private void clearSignature() {
                this.bitField0_ &= -3;
                this.signature_ = 0;
            }

            private void clearVendorName() {
                this.bitField0_ &= -2;
                this.vendorName_ = getDefaultInstance().getVendorName();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static g1 newBuilder() {
                return (g1) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setIsHypervisor(boolean z) {
                this.bitField0_ |= 16;
                this.isHypervisor_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumCores(int i) {
                this.bitField0_ |= 4;
                this.numCores_ = i;
            }

            private void setNumEfficientCores(int i) {
                this.bitField0_ |= 8;
                this.numEfficientCores_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSignature(int i) {
                this.bitField0_ |= 2;
                this.signature_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVendorName(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.vendorName_ = str;
            }

            private void setVendorNameBytes(ByteString byteString) {
                this.vendorName_ = byteString.r();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new g1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0004\u0005ဋ\u0003", new Object[]{"bitField0_", "vendorName_", "signature_", "numCores_", "isHypervisor_", "numEfficientCores_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (a.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs(DEFAULT_INSTANCE);
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public boolean getIsHypervisor() {
                return this.isHypervisor_;
            }

            public int getNumCores() {
                return this.numCores_;
            }

            public int getNumEfficientCores() {
                return this.numEfficientCores_;
            }

            public int getSignature() {
                return this.signature_;
            }

            public String getVendorName() {
                return this.vendorName_;
            }

            public ByteString getVendorNameBytes() {
                return ByteString.g(this.vendorName_);
            }

            public boolean hasIsHypervisor() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasNumCores() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasNumEfficientCores() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasSignature() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasVendorName() {
                return (this.bitField0_ & 1) != 0;
            }

            public static g1 newBuilder(a aVar) {
                return (g1) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static a parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static a parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static a parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(eac eacVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static a parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends GeneratedMessageLite implements zt10 {
            private static final b DEFAULT_INSTANCE;
            public static final int HAS_SEEK_PENALTY_FIELD_NUMBER = 1;
            private static volatile of90 PARSER;
            private int bitField0_;
            private boolean hasSeekPenalty_;

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
            }

            private b() {
            }

            private void clearHasSeekPenalty() {
                this.bitField0_ &= -2;
                this.hasSeekPenalty_ = false;
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static h1 newBuilder() {
                return (h1) DEFAULT_INSTANCE.createBuilder();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setHasSeekPenalty(boolean z) {
                this.bitField0_ |= 1;
                this.hasSeekPenalty_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new h1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "hasSeekPenalty_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (b.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public boolean getHasSeekPenalty() {
                return this.hasSeekPenalty_;
            }

            public boolean hasHasSeekPenalty() {
                return (this.bitField0_ & 1) != 0;
            }

            public static h1 newBuilder(b bVar) {
                return (h1) DEFAULT_INSTANCE.createBuilder(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (b) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static b parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static b parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static b parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static b parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static b parseFrom(eac eacVar) throws IOException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static b parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends GeneratedMessageLite implements zt10 {
            private static final c DEFAULT_INSTANCE;
            public static final int DEVICE_ID_FIELD_NUMBER = 2;
            public static final int DRIVER_VERSION_FIELD_NUMBER = 3;
            public static final int GL_RENDERER_FIELD_NUMBER = 7;
            public static final int GL_VENDOR_FIELD_NUMBER = 6;
            private static volatile of90 PARSER = null;
            public static final int VENDOR_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private int deviceId_;
            private int vendorId_;
            private String driverVersion_ = "";
            private String glVendor_ = "";
            private String glRenderer_ = "";

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
            }

            private c() {
            }

            private void clearDeviceId() {
                this.bitField0_ &= -3;
                this.deviceId_ = 0;
            }

            private void clearDriverVersion() {
                this.bitField0_ &= -5;
                this.driverVersion_ = getDefaultInstance().getDriverVersion();
            }

            private void clearGlRenderer() {
                this.bitField0_ &= -17;
                this.glRenderer_ = getDefaultInstance().getGlRenderer();
            }

            private void clearGlVendor() {
                this.bitField0_ &= -9;
                this.glVendor_ = getDefaultInstance().getGlVendor();
            }

            private void clearVendorId() {
                this.bitField0_ &= -2;
                this.vendorId_ = 0;
            }

            public static c getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static k1 newBuilder() {
                return (k1) DEFAULT_INSTANCE.createBuilder();
            }

            public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (c) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static c parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDeviceId(int i) {
                this.bitField0_ |= 2;
                this.deviceId_ = i;
            }

            private void setDriverVersion(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.driverVersion_ = str;
            }

            private void setDriverVersionBytes(ByteString byteString) {
                this.driverVersion_ = byteString.r();
                this.bitField0_ |= 4;
            }

            private void setGlRenderer(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.glRenderer_ = str;
            }

            private void setGlRendererBytes(ByteString byteString) {
                this.glRenderer_ = byteString.r();
                this.bitField0_ |= 16;
            }

            private void setGlVendor(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.glVendor_ = str;
            }

            private void setGlVendorBytes(ByteString byteString) {
                this.glVendor_ = byteString.r();
                this.bitField0_ |= 8;
            }

            private void setVendorId(int i) {
                this.bitField0_ |= 1;
                this.vendorId_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new c();
                    case 2:
                        return new k1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004", new Object[]{"bitField0_", "vendorId_", "deviceId_", "driverVersion_", "glVendor_", "glRenderer_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (c.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public int getDeviceId() {
                return this.deviceId_;
            }

            public String getDriverVersion() {
                return this.driverVersion_;
            }

            public ByteString getDriverVersionBytes() {
                return ByteString.g(this.driverVersion_);
            }

            public String getGlRenderer() {
                return this.glRenderer_;
            }

            public ByteString getGlRendererBytes() {
                return ByteString.g(this.glRenderer_);
            }

            public String getGlVendor() {
                return this.glVendor_;
            }

            public ByteString getGlVendorBytes() {
                return ByteString.g(this.glVendor_);
            }

            public int getVendorId() {
                return this.vendorId_;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasDriverVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasGlRenderer() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasGlVendor() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasVendorId() {
                return (this.bitField0_ & 1) != 0;
            }

            public static k1 newBuilder(c cVar) {
                return (k1) DEFAULT_INSTANCE.createBuilder(cVar);
            }

            public static c parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (c) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static c parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static c parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static c parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static c parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static c parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static c parseFrom(InputStream inputStream) throws IOException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static c parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static c parseFrom(eac eacVar) throws IOException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static c parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends GeneratedMessageLite implements zt10 {
            public static final int BIOS_MANUFACTURER_FIELD_NUMBER = 3;
            public static final int BIOS_TYPE_FIELD_NUMBER = 5;
            public static final int BIOS_VERSION_FIELD_NUMBER = 4;
            private static final d DEFAULT_INSTANCE;
            public static final int MANUFACTURER_FIELD_NUMBER = 1;
            public static final int MODEL_FIELD_NUMBER = 2;
            private static volatile of90 PARSER;
            private int biosType_;
            private int bitField0_;
            private String manufacturer_ = "";
            private String model_ = "";
            private String biosManufacturer_ = "";
            private String biosVersion_ = "";

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
            }

            private d() {
            }

            private void clearBiosManufacturer() {
                this.bitField0_ &= -5;
                this.biosManufacturer_ = getDefaultInstance().getBiosManufacturer();
            }

            private void clearBiosType() {
                this.bitField0_ &= -17;
                this.biosType_ = 0;
            }

            private void clearBiosVersion() {
                this.bitField0_ &= -9;
                this.biosVersion_ = getDefaultInstance().getBiosVersion();
            }

            private void clearManufacturer() {
                this.bitField0_ &= -2;
                this.manufacturer_ = getDefaultInstance().getManufacturer();
            }

            private void clearModel() {
                this.bitField0_ &= -3;
                this.model_ = getDefaultInstance().getModel();
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static r1 newBuilder() {
                return (r1) DEFAULT_INSTANCE.createBuilder();
            }

            public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (d) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBiosManufacturer(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.biosManufacturer_ = str;
            }

            private void setBiosManufacturerBytes(ByteString byteString) {
                this.biosManufacturer_ = byteString.r();
                this.bitField0_ |= 4;
            }

            private void setBiosType(BiosType biosType) {
                this.biosType_ = biosType.getNumber();
                this.bitField0_ |= 16;
            }

            private void setBiosVersion(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.biosVersion_ = str;
            }

            private void setBiosVersionBytes(ByteString byteString) {
                this.biosVersion_ = byteString.r();
                this.bitField0_ |= 8;
            }

            private void setManufacturer(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.manufacturer_ = str;
            }

            private void setManufacturerBytes(ByteString byteString) {
                this.manufacturer_ = byteString.r();
                this.bitField0_ |= 1;
            }

            private void setModel(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.model_ = str;
            }

            private void setModelBytes(ByteString byteString) {
                this.model_ = byteString.r();
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new r1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "manufacturer_", "model_", "biosManufacturer_", "biosVersion_", "biosType_", e1.a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (d.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public String getBiosManufacturer() {
                return this.biosManufacturer_;
            }

            public ByteString getBiosManufacturerBytes() {
                return ByteString.g(this.biosManufacturer_);
            }

            public BiosType getBiosType() {
                BiosType a = BiosType.a(this.biosType_);
                return a == null ? BiosType.BIOS_TYPE_UNKNOWN : a;
            }

            public String getBiosVersion() {
                return this.biosVersion_;
            }

            public ByteString getBiosVersionBytes() {
                return ByteString.g(this.biosVersion_);
            }

            public String getManufacturer() {
                return this.manufacturer_;
            }

            public ByteString getManufacturerBytes() {
                return ByteString.g(this.manufacturer_);
            }

            public String getModel() {
                return this.model_;
            }

            public ByteString getModelBytes() {
                return ByteString.g(this.model_);
            }

            public boolean hasBiosManufacturer() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasBiosType() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasBiosVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasManufacturer() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasModel() {
                return (this.bitField0_ & 2) != 0;
            }

            public static r1 newBuilder(d dVar) {
                return (r1) DEFAULT_INSTANCE.createBuilder(dVar);
            }

            public static d parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (d) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static d parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static d parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static d parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static d parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static d parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static d parseFrom(InputStream inputStream) throws IOException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static d parseFrom(eac eacVar) throws IOException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static d parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        public static f1 newBuilder(Hardware hardware) {
            return (f1) DEFAULT_INSTANCE.createBuilder(hardware);
        }

        public static Hardware parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Hardware) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Hardware parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static Hardware parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Hardware parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        private void addInternalStorageDevices(int i, InternalStorageDevice internalStorageDevice) {
            internalStorageDevice.getClass();
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.add(i, internalStorageDevice);
        }

        public static Hardware parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Hardware parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static Hardware parseFrom(InputStream inputStream) throws IOException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Hardware parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Hardware parseFrom(eac eacVar) throws IOException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static Hardware parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (Hardware) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class OS extends GeneratedMessageLite implements zt10 {
        public static final int ARC_FIELD_NUMBER = 7;
        public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 3;
        public static final int BUILD_NUMBER_FIELD_NUMBER = 5;
        public static final int DARK_MODE_STATE_FIELD_NUMBER = 8;
        private static final OS DEFAULT_INSTANCE;
        public static final int KERNEL_VERSION_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile of90 PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        public static final int XDG_CURRENT_DESKTOP_FIELD_NUMBER = 10;
        public static final int XDG_SESSION_TYPE_FIELD_NUMBER = 9;
        private a arc_;
        private int bitField0_;
        private int darkModeState_;
        private int xdgCurrentDesktop_;
        private int xdgSessionType_;
        private String name_ = "";
        private String version_ = "";
        private String buildFingerprint_ = "";
        private String buildNumber_ = "";
        private String kernelVersion_ = "";

        public enum DarkModeState implements dqw {
            UNKNOWN(0),
            DARK_MODE_SYSTEM(1),
            DARK_MODE_APP(2),
            LIGHT_MODE_SYSTEM(3),
            LIGHT_MODE_APP(4);

            public static final int DARK_MODE_APP_VALUE = 2;
            public static final int DARK_MODE_SYSTEM_VALUE = 1;
            public static final int LIGHT_MODE_APP_VALUE = 4;
            public static final int LIGHT_MODE_SYSTEM_VALUE = 3;
            public static final int UNKNOWN_VALUE = 0;
            private static final fqw internalValueMap = new i2();
            private final int value;

            DarkModeState(int i) {
                this.value = i;
            }

            public static DarkModeState a(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return DARK_MODE_SYSTEM;
                }
                if (i == 2) {
                    return DARK_MODE_APP;
                }
                if (i == 3) {
                    return LIGHT_MODE_SYSTEM;
                }
                if (i != 4) {
                    return null;
                }
                return LIGHT_MODE_APP;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum XdgCurrentDesktop implements dqw {
            OTHER(0),
            CINNAMON(1),
            DEEPIN(2),
            GNOME(3),
            KDE(4),
            PANTHEON(5),
            UKUI(6),
            UNITY(7),
            XFCE(8),
            LXQT(9),
            COSMIC(10),
            FLY(100);

            public static final int CINNAMON_VALUE = 1;
            public static final int COSMIC_VALUE = 10;
            public static final int DEEPIN_VALUE = 2;
            public static final int FLY_VALUE = 100;
            public static final int GNOME_VALUE = 3;
            public static final int KDE_VALUE = 4;
            public static final int LXQT_VALUE = 9;
            public static final int OTHER_VALUE = 0;
            public static final int PANTHEON_VALUE = 5;
            public static final int UKUI_VALUE = 6;
            public static final int UNITY_VALUE = 7;
            public static final int XFCE_VALUE = 8;
            private static final fqw internalValueMap = new k2();
            private final int value;

            XdgCurrentDesktop(int i) {
                this.value = i;
            }

            public static XdgCurrentDesktop a(int i) {
                if (i == 100) {
                    return FLY;
                }
                switch (i) {
                    case 0:
                        return OTHER;
                    case 1:
                        return CINNAMON;
                    case 2:
                        return DEEPIN;
                    case 3:
                        return GNOME;
                    case 4:
                        return KDE;
                    case 5:
                        return PANTHEON;
                    case 6:
                        return UKUI;
                    case 7:
                        return UNITY;
                    case 8:
                        return XFCE;
                    case 9:
                        return LXQT;
                    case 10:
                        return COSMIC;
                    default:
                        return null;
                }
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum XdgSessionType implements dqw {
            UNSET(0),
            OTHER_SESSION_TYPE(1),
            UNSPECIFIED(2),
            TTY(3),
            X11(4),
            WAYLAND(5),
            MIR(6);

            public static final int MIR_VALUE = 6;
            public static final int OTHER_SESSION_TYPE_VALUE = 1;
            public static final int TTY_VALUE = 3;
            public static final int UNSET_VALUE = 0;
            public static final int UNSPECIFIED_VALUE = 2;
            public static final int WAYLAND_VALUE = 5;
            public static final int X11_VALUE = 4;
            private static final fqw internalValueMap = new m2();
            private final int value;

            XdgSessionType(int i) {
                this.value = i;
            }

            public static XdgSessionType a(int i) {
                switch (i) {
                    case 0:
                        return UNSET;
                    case 1:
                        return OTHER_SESSION_TYPE;
                    case 2:
                        return UNSPECIFIED;
                    case 3:
                        return TTY;
                    case 4:
                        return X11;
                    case 5:
                        return WAYLAND;
                    case 6:
                        return MIR;
                    default:
                        return null;
                }
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            OS os = new OS();
            DEFAULT_INSTANCE = os;
            GeneratedMessageLite.registerDefaultInstance(OS.class, os);
        }

        private OS() {
        }

        private void clearArc() {
            this.arc_ = null;
            this.bitField0_ &= -33;
        }

        private void clearBuildFingerprint() {
            this.bitField0_ &= -5;
            this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
        }

        private void clearBuildNumber() {
            this.bitField0_ &= -9;
            this.buildNumber_ = getDefaultInstance().getBuildNumber();
        }

        private void clearDarkModeState() {
            this.bitField0_ &= -65;
            this.darkModeState_ = 0;
        }

        private void clearKernelVersion() {
            this.bitField0_ &= -17;
            this.kernelVersion_ = getDefaultInstance().getKernelVersion();
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        private void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        private void clearXdgCurrentDesktop() {
            this.bitField0_ &= -257;
            this.xdgCurrentDesktop_ = 0;
        }

        private void clearXdgSessionType() {
            this.bitField0_ &= -129;
            this.xdgSessionType_ = 0;
        }

        public static OS getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeArc(a aVar) {
            aVar.getClass();
            a aVar2 = this.arc_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.arc_ = aVar;
            } else {
                this.arc_ = (a) ((g2) a.newBuilder(this.arc_).mergeFrom((GeneratedMessageLite) aVar)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        public static h2 newBuilder() {
            return (h2) DEFAULT_INSTANCE.createBuilder();
        }

        public static OS parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OS) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OS parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setArc(a aVar) {
            aVar.getClass();
            this.arc_ = aVar;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprint(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.buildFingerprint_ = str;
        }

        private void setBuildFingerprintBytes(ByteString byteString) {
            this.buildFingerprint_ = byteString.r();
            this.bitField0_ |= 4;
        }

        private void setBuildNumber(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.buildNumber_ = str;
        }

        private void setBuildNumberBytes(ByteString byteString) {
            this.buildNumber_ = byteString.r();
            this.bitField0_ |= 8;
        }

        private void setDarkModeState(DarkModeState darkModeState) {
            this.darkModeState_ = darkModeState.getNumber();
            this.bitField0_ |= 64;
        }

        private void setKernelVersion(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.kernelVersion_ = str;
        }

        private void setKernelVersionBytes(ByteString byteString) {
            this.kernelVersion_ = byteString.r();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        private void setNameBytes(ByteString byteString) {
            this.name_ = byteString.r();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        private void setVersionBytes(ByteString byteString) {
            this.version_ = byteString.r();
            this.bitField0_ |= 2;
        }

        private void setXdgCurrentDesktop(XdgCurrentDesktop xdgCurrentDesktop) {
            this.xdgCurrentDesktop_ = xdgCurrentDesktop.getNumber();
            this.bitField0_ |= 256;
        }

        private void setXdgSessionType(XdgSessionType xdgSessionType) {
            this.xdgSessionType_ = xdgSessionType.getNumber();
            this.bitField0_ |= 128;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OS();
                case 2:
                    return new h2(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\b᠌\u0006\t᠌\u0007\n᠌\b", new Object[]{"bitField0_", "name_", "version_", "buildFingerprint_", "buildNumber_", "kernelVersion_", "arc_", "darkModeState_", j2.a, "xdgSessionType_", n2.a, "xdgCurrentDesktop_", l2.a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (OS.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public a getArc() {
            a aVar = this.arc_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public String getBuildFingerprint() {
            return this.buildFingerprint_;
        }

        public ByteString getBuildFingerprintBytes() {
            return ByteString.g(this.buildFingerprint_);
        }

        public String getBuildNumber() {
            return this.buildNumber_;
        }

        public ByteString getBuildNumberBytes() {
            return ByteString.g(this.buildNumber_);
        }

        public DarkModeState getDarkModeState() {
            DarkModeState a2 = DarkModeState.a(this.darkModeState_);
            return a2 == null ? DarkModeState.UNKNOWN : a2;
        }

        public String getKernelVersion() {
            return this.kernelVersion_;
        }

        public ByteString getKernelVersionBytes() {
            return ByteString.g(this.kernelVersion_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.g(this.name_);
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.g(this.version_);
        }

        public XdgCurrentDesktop getXdgCurrentDesktop() {
            XdgCurrentDesktop a2 = XdgCurrentDesktop.a(this.xdgCurrentDesktop_);
            return a2 == null ? XdgCurrentDesktop.OTHER : a2;
        }

        public XdgSessionType getXdgSessionType() {
            XdgSessionType a2 = XdgSessionType.a(this.xdgSessionType_);
            return a2 == null ? XdgSessionType.UNSET : a2;
        }

        public boolean hasArc() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasBuildFingerprint() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasBuildNumber() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDarkModeState() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasKernelVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasXdgCurrentDesktop() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasXdgSessionType() {
            return (this.bitField0_ & 128) != 0;
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite implements zt10 {
            private static final a DEFAULT_INSTANCE;
            private static volatile of90 PARSER = null;
            public static final int RELEASE_FIELD_NUMBER = 1;
            private int bitField0_;
            private String release_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearRelease() {
                this.bitField0_ &= -2;
                this.release_ = getDefaultInstance().getRelease();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static g2 newBuilder() {
                return (g2) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static of90 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRelease(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.release_ = str;
            }

            private void setReleaseBytes(ByteString byteString) {
                this.release_ = byteString.r();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                of90 of90Var;
                switch (p3x0.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new g2(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "release_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        of90 of90Var2 = PARSER;
                        if (of90Var2 != null) {
                            return of90Var2;
                        }
                        synchronized (a.class) {
                            try {
                                of90Var = PARSER;
                                if (of90Var == null) {
                                    of90Var = new oxs();
                                    PARSER = of90Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return of90Var;
                    case 6:
                        return (byte) 1;
                    default:
                        w511.u();
                    case 7:
                        return null;
                }
            }

            public String getRelease() {
                return this.release_;
            }

            public ByteString getReleaseBytes() {
                return ByteString.g(this.release_);
            }

            public boolean hasRelease() {
                return (this.bitField0_ & 1) != 0;
            }

            public static g2 newBuilder(a aVar) {
                return (g2) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
            }

            public static a parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static a parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
            }

            public static a parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
            }

            public static a parseFrom(eac eacVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
            }

            public static a parseFrom(eac eacVar, pyo pyoVar) throws IOException {
                return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
            }
        }

        public static h2 newBuilder(OS os) {
            return (h2) DEFAULT_INSTANCE.createBuilder(os);
        }

        public static OS parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (OS) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static OS parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static OS parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OS parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static OS parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OS parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static OS parseFrom(InputStream inputStream) throws IOException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OS parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static OS parseFrom(eac eacVar) throws IOException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static OS parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (OS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AccessibilityState extends GeneratedMessageLite implements zt10 {
        private static final AccessibilityState DEFAULT_INSTANCE;
        public static final int ENABLED_MODES_FIELD_NUMBER = 1;
        private static volatile of90 PARSER;
        private static final kqw enabledModes_converter_ = new com.yandex.pulse.metrics.h();
        private int enabledModesMemoizedSerializedSize;
        private jqw enabledModes_ = GeneratedMessageLite.emptyIntList();

        public enum AXMode implements dqw {
            NATIVE_APIS(0),
            WEB_CONTENTS(1),
            INLINE_TEXT_BOXES(2),
            EXTENDED_PROPERTIES(3),
            HTML(4),
            HTML_METADATA(5),
            LABEL_IMAGES(6),
            PDF_PRINTING(7),
            PDF_OCR(8),
            ANNOTATE_MAIN_NODE(9),
            FROM_PLATFORM(10),
            SCREEN_READER(11);

            public static final int ANNOTATE_MAIN_NODE_VALUE = 9;
            public static final int EXTENDED_PROPERTIES_VALUE = 3;
            public static final int FROM_PLATFORM_VALUE = 10;
            public static final int HTML_METADATA_VALUE = 5;
            public static final int HTML_VALUE = 4;
            public static final int INLINE_TEXT_BOXES_VALUE = 2;
            public static final int LABEL_IMAGES_VALUE = 6;
            public static final int NATIVE_APIS_VALUE = 0;
            public static final int PDF_OCR_VALUE = 8;
            public static final int PDF_PRINTING_VALUE = 7;
            public static final int SCREEN_READER_VALUE = 11;
            public static final int WEB_CONTENTS_VALUE = 1;
            private static final fqw internalValueMap = new i();
            private final int value;

            AXMode(int i) {
                this.value = i;
            }

            public static AXMode a(int i) {
                switch (i) {
                    case 0:
                        return NATIVE_APIS;
                    case 1:
                        return WEB_CONTENTS;
                    case 2:
                        return INLINE_TEXT_BOXES;
                    case 3:
                        return EXTENDED_PROPERTIES;
                    case 4:
                        return HTML;
                    case 5:
                        return HTML_METADATA;
                    case 6:
                        return LABEL_IMAGES;
                    case 7:
                        return PDF_PRINTING;
                    case 8:
                        return PDF_OCR;
                    case 9:
                        return ANNOTATE_MAIN_NODE;
                    case 10:
                        return FROM_PLATFORM;
                    case 11:
                        return SCREEN_READER;
                    default:
                        return null;
                }
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            AccessibilityState accessibilityState = new AccessibilityState();
            DEFAULT_INSTANCE = accessibilityState;
            GeneratedMessageLite.registerDefaultInstance(AccessibilityState.class, accessibilityState);
        }

        private AccessibilityState() {
        }

        private void addAllEnabledModes(Iterable<? extends AXMode> iterable) {
            ensureEnabledModesIsMutable();
            for (AXMode aXMode : iterable) {
                ((o5w) this.enabledModes_).b(aXMode.getNumber());
            }
        }

        private void addEnabledModes(AXMode aXMode) {
            aXMode.getClass();
            ensureEnabledModesIsMutable();
            ((o5w) this.enabledModes_).b(aXMode.getNumber());
        }

        private void clearEnabledModes() {
            this.enabledModes_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureEnabledModesIsMutable() {
            jqw jqwVar = this.enabledModes_;
            if (((p9) jqwVar).a) {
                return;
            }
            this.enabledModes_ = GeneratedMessageLite.mutableCopy(jqwVar);
        }

        public static AccessibilityState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static k newBuilder() {
            return (k) DEFAULT_INSTANCE.createBuilder();
        }

        public static AccessibilityState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AccessibilityState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessibilityState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEnabledModes(int i, AXMode aXMode) {
            aXMode.getClass();
            ensureEnabledModesIsMutable();
            ((o5w) this.enabledModes_).g(i, aXMode.getNumber());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AccessibilityState();
                case 2:
                    return new k(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"enabledModes_", j.a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (AccessibilityState.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public AXMode getEnabledModes(int i) {
            AXMode a = AXMode.a(((o5w) this.enabledModes_).e(i));
            return a == null ? AXMode.NATIVE_APIS : a;
        }

        public int getEnabledModesCount() {
            return this.enabledModes_.size();
        }

        public List<AXMode> getEnabledModesList() {
            return new lqw(this.enabledModes_, enabledModes_converter_);
        }

        public static k newBuilder(AccessibilityState accessibilityState) {
            return (k) DEFAULT_INSTANCE.createBuilder(accessibilityState);
        }

        public static AccessibilityState parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (AccessibilityState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static AccessibilityState parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static AccessibilityState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AccessibilityState parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static AccessibilityState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AccessibilityState parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static AccessibilityState parseFrom(InputStream inputStream) throws IOException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessibilityState parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static AccessibilityState parseFrom(eac eacVar) throws IOException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static AccessibilityState parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (AccessibilityState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class Network extends GeneratedMessageLite implements zt10 {
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
        public static final int CONNECTION_TYPE_IS_AMBIGUOUS_FIELD_NUMBER = 1;
        private static final Network DEFAULT_INSTANCE;
        public static final int MAX_EFFECTIVE_CONNECTION_TYPE_FIELD_NUMBER = 8;
        public static final int MIN_EFFECTIVE_CONNECTION_TYPE_FIELD_NUMBER = 7;
        private static volatile of90 PARSER;
        private int bitField0_;
        private boolean connectionTypeIsAmbiguous_;
        private int connectionType_;
        private int maxEffectiveConnectionType_;
        private int minEffectiveConnectionType_;

        public enum ConnectionType implements dqw {
            CONNECTION_UNKNOWN(0),
            CONNECTION_ETHERNET(1),
            CONNECTION_WIFI(2),
            CONNECTION_2G(3),
            CONNECTION_3G(4),
            CONNECTION_4G(5),
            CONNECTION_BLUETOOTH(6),
            CONNECTION_NONE(7),
            CONNECTION_AMBIGUOUS(8),
            CONNECTION_5G(9);

            public static final int CONNECTION_2G_VALUE = 3;
            public static final int CONNECTION_3G_VALUE = 4;
            public static final int CONNECTION_4G_VALUE = 5;
            public static final int CONNECTION_5G_VALUE = 9;
            public static final int CONNECTION_AMBIGUOUS_VALUE = 8;
            public static final int CONNECTION_BLUETOOTH_VALUE = 6;
            public static final int CONNECTION_ETHERNET_VALUE = 1;
            public static final int CONNECTION_NONE_VALUE = 7;
            public static final int CONNECTION_UNKNOWN_VALUE = 0;
            public static final int CONNECTION_WIFI_VALUE = 2;
            private static final fqw internalValueMap = new c2();
            private final int value;

            ConnectionType(int i) {
                this.value = i;
            }

            public static ConnectionType a(int i) {
                switch (i) {
                    case 0:
                        return CONNECTION_UNKNOWN;
                    case 1:
                        return CONNECTION_ETHERNET;
                    case 2:
                        return CONNECTION_WIFI;
                    case 3:
                        return CONNECTION_2G;
                    case 4:
                        return CONNECTION_3G;
                    case 5:
                        return CONNECTION_4G;
                    case 6:
                        return CONNECTION_BLUETOOTH;
                    case 7:
                        return CONNECTION_NONE;
                    case 8:
                        return CONNECTION_AMBIGUOUS;
                    case 9:
                        return CONNECTION_5G;
                    default:
                        return null;
                }
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum EffectiveConnectionType implements dqw {
            EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
            DEPRECATED_EFFECTIVE_CONNECTION_TYPE_AMBIGUOUS(1),
            EFFECTIVE_CONNECTION_TYPE_OFFLINE(2),
            EFFECTIVE_CONNECTION_TYPE_SLOW_2G(3),
            EFFECTIVE_CONNECTION_TYPE_2G(4),
            EFFECTIVE_CONNECTION_TYPE_3G(5),
            EFFECTIVE_CONNECTION_TYPE_4G(6);


            @Deprecated
            public static final int DEPRECATED_EFFECTIVE_CONNECTION_TYPE_AMBIGUOUS_VALUE = 1;
            public static final int EFFECTIVE_CONNECTION_TYPE_2G_VALUE = 4;
            public static final int EFFECTIVE_CONNECTION_TYPE_3G_VALUE = 5;
            public static final int EFFECTIVE_CONNECTION_TYPE_4G_VALUE = 6;
            public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE_VALUE = 2;
            public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G_VALUE = 3;
            public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN_VALUE = 0;
            private static final fqw internalValueMap = new e2();
            private final int value;

            EffectiveConnectionType(int i) {
                this.value = i;
            }

            public static EffectiveConnectionType a(int i) {
                switch (i) {
                    case 0:
                        return EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
                    case 1:
                        return DEPRECATED_EFFECTIVE_CONNECTION_TYPE_AMBIGUOUS;
                    case 2:
                        return EFFECTIVE_CONNECTION_TYPE_OFFLINE;
                    case 3:
                        return EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
                    case 4:
                        return EFFECTIVE_CONNECTION_TYPE_2G;
                    case 5:
                        return EFFECTIVE_CONNECTION_TYPE_3G;
                    case 6:
                        return EFFECTIVE_CONNECTION_TYPE_4G;
                    default:
                        return null;
                }
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Network network = new Network();
            DEFAULT_INSTANCE = network;
            GeneratedMessageLite.registerDefaultInstance(Network.class, network);
        }

        private Network() {
        }

        private void clearConnectionType() {
            this.bitField0_ &= -3;
            this.connectionType_ = 0;
        }

        private void clearConnectionTypeIsAmbiguous() {
            this.bitField0_ &= -2;
            this.connectionTypeIsAmbiguous_ = false;
        }

        private void clearMaxEffectiveConnectionType() {
            this.bitField0_ &= -9;
            this.maxEffectiveConnectionType_ = 0;
        }

        private void clearMinEffectiveConnectionType() {
            this.bitField0_ &= -5;
            this.minEffectiveConnectionType_ = 0;
        }

        public static Network getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b2 newBuilder() {
            return (b2) DEFAULT_INSTANCE.createBuilder();
        }

        public static Network parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Network) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Network parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(ConnectionType connectionType) {
            this.connectionType_ = connectionType.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeIsAmbiguous(boolean z) {
            this.bitField0_ |= 1;
            this.connectionTypeIsAmbiguous_ = z;
        }

        private void setMaxEffectiveConnectionType(EffectiveConnectionType effectiveConnectionType) {
            this.maxEffectiveConnectionType_ = effectiveConnectionType.getNumber();
            this.bitField0_ |= 8;
        }

        private void setMinEffectiveConnectionType(EffectiveConnectionType effectiveConnectionType) {
            this.minEffectiveConnectionType_ = effectiveConnectionType.getNumber();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Network();
                case 2:
                    return new b2(DEFAULT_INSTANCE);
                case 3:
                    d2 d2Var = d2.a;
                    f2 f2Var = f2.a;
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0007᠌\u0002\b᠌\u0003", new Object[]{"bitField0_", "connectionTypeIsAmbiguous_", "connectionType_", d2Var, "minEffectiveConnectionType_", f2Var, "maxEffectiveConnectionType_", f2Var});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (Network.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public ConnectionType getConnectionType() {
            ConnectionType a = ConnectionType.a(this.connectionType_);
            return a == null ? ConnectionType.CONNECTION_UNKNOWN : a;
        }

        public boolean getConnectionTypeIsAmbiguous() {
            return this.connectionTypeIsAmbiguous_;
        }

        public EffectiveConnectionType getMaxEffectiveConnectionType() {
            EffectiveConnectionType a = EffectiveConnectionType.a(this.maxEffectiveConnectionType_);
            return a == null ? EffectiveConnectionType.EFFECTIVE_CONNECTION_TYPE_UNKNOWN : a;
        }

        public EffectiveConnectionType getMinEffectiveConnectionType() {
            EffectiveConnectionType a = EffectiveConnectionType.a(this.minEffectiveConnectionType_);
            return a == null ? EffectiveConnectionType.EFFECTIVE_CONNECTION_TYPE_UNKNOWN : a;
        }

        public boolean hasConnectionType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasConnectionTypeIsAmbiguous() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMaxEffectiveConnectionType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMinEffectiveConnectionType() {
            return (this.bitField0_ & 4) != 0;
        }

        public static b2 newBuilder(Network network) {
            return (b2) DEFAULT_INSTANCE.createBuilder(network);
        }

        public static Network parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Network) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Network parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static Network parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Network parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static Network parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Network parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static Network parseFrom(InputStream inputStream) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Network parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Network parseFrom(eac eacVar) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static Network parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class Yandex extends GeneratedMessageLite implements zt10 {
        public static final int BRAND_ID_FIELD_NUMBER = 2;
        public static final int BUILD_FIELD_NUMBER = 3;
        public static final int CLIENT_VERSION_FIELD_NUMBER = 13;
        private static final Yandex DEFAULT_INSTANCE;
        public static final int DEGRADATION_FIELD_NUMBER = 10;
        public static final int DEVICE_FORM_FACTOR_FIELD_NUMBER = 12;
        public static final int ENERGY_SAVING_FIELD_NUMBER = 11;
        public static final int GPU_OPTIMUS_FIELD_NUMBER = 4;
        public static final int MACHINE_ID_FIELD_NUMBER = 9;
        public static final int METRICA_API_KEY_FIELD_NUMBER = 6;
        private static volatile of90 PARSER = null;
        public static final int PARTNER_ID_FIELD_NUMBER = 7;
        public static final int UI_FIELD_NUMBER = 1;
        public static final int UPDATER_CLID_FIELD_NUMBER = 8;
        public static final int UUID_FIELD_NUMBER = 14;
        private int bitField0_;
        private int degradation_;
        private int deviceFormFactor_;
        private int energySaving_;
        private boolean gpuOptimus_;
        private String ui_ = "";
        private String brandId_ = "";
        private String build_ = "";
        private String metricaApiKey_ = "";
        private String partnerId_ = "";
        private String updaterClid_ = "";
        private String machineId_ = "";
        private String clientVersion_ = "";
        private String uuid_ = "";

        public enum DegradationMode implements dqw {
            DEGRADATION_OFF(0),
            DEGRADATION_ON(1),
            DEGRADATION_AMBIGOUS(2);

            public static final int DEGRADATION_AMBIGOUS_VALUE = 2;
            public static final int DEGRADATION_OFF_VALUE = 0;
            public static final int DEGRADATION_ON_VALUE = 1;
            private static final fqw internalValueMap = new t2();
            private final int value;

            DegradationMode(int i) {
                this.value = i;
            }

            public static DegradationMode a(int i) {
                if (i == 0) {
                    return DEGRADATION_OFF;
                }
                if (i == 1) {
                    return DEGRADATION_ON;
                }
                if (i != 2) {
                    return null;
                }
                return DEGRADATION_AMBIGOUS;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum DeviceFormFactor implements dqw {
            DEVICE_FORM_FACTOR_DESKTOP(0),
            DEVICE_FORM_FACTOR_PHONE(1),
            DEVICE_FORM_FACTOR_TABLET(2),
            DEVICE_FORM_FACTOR_TV(3),
            DEVICE_FORM_FACTOR_AUTOMOTIVE(4),
            DEVICE_FORM_FACTOR_FOLDABLE(5);

            public static final int DEVICE_FORM_FACTOR_AUTOMOTIVE_VALUE = 4;
            public static final int DEVICE_FORM_FACTOR_DESKTOP_VALUE = 0;
            public static final int DEVICE_FORM_FACTOR_FOLDABLE_VALUE = 5;
            public static final int DEVICE_FORM_FACTOR_PHONE_VALUE = 1;
            public static final int DEVICE_FORM_FACTOR_TABLET_VALUE = 2;
            public static final int DEVICE_FORM_FACTOR_TV_VALUE = 3;
            private static final fqw internalValueMap = new v2();
            private final int value;

            DeviceFormFactor(int i) {
                this.value = i;
            }

            public static DeviceFormFactor a(int i) {
                if (i == 0) {
                    return DEVICE_FORM_FACTOR_DESKTOP;
                }
                if (i == 1) {
                    return DEVICE_FORM_FACTOR_PHONE;
                }
                if (i == 2) {
                    return DEVICE_FORM_FACTOR_TABLET;
                }
                if (i == 3) {
                    return DEVICE_FORM_FACTOR_TV;
                }
                if (i == 4) {
                    return DEVICE_FORM_FACTOR_AUTOMOTIVE;
                }
                if (i != 5) {
                    return null;
                }
                return DEVICE_FORM_FACTOR_FOLDABLE;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        public enum EnergySavingMode implements dqw {
            ENERGY_SAVING_OFF(0),
            ENERGY_SAVING_ON(1),
            ENERGY_SAVING_AMBIGOUS(2);

            public static final int ENERGY_SAVING_AMBIGOUS_VALUE = 2;
            public static final int ENERGY_SAVING_OFF_VALUE = 0;
            public static final int ENERGY_SAVING_ON_VALUE = 1;
            private static final fqw internalValueMap = new x2();
            private final int value;

            EnergySavingMode(int i) {
                this.value = i;
            }

            public static EnergySavingMode a(int i) {
                if (i == 0) {
                    return ENERGY_SAVING_OFF;
                }
                if (i == 1) {
                    return ENERGY_SAVING_ON;
                }
                if (i != 2) {
                    return null;
                }
                return ENERGY_SAVING_AMBIGOUS;
            }

            @Override // defpackage.dqw
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Yandex yandex = new Yandex();
            DEFAULT_INSTANCE = yandex;
            GeneratedMessageLite.registerDefaultInstance(Yandex.class, yandex);
        }

        private Yandex() {
        }

        private void clearBrandId() {
            this.bitField0_ &= -3;
            this.brandId_ = getDefaultInstance().getBrandId();
        }

        private void clearBuild() {
            this.bitField0_ &= -5;
            this.build_ = getDefaultInstance().getBuild();
        }

        private void clearClientVersion() {
            this.bitField0_ &= -2049;
            this.clientVersion_ = getDefaultInstance().getClientVersion();
        }

        private void clearDegradation() {
            this.bitField0_ &= -257;
            this.degradation_ = 0;
        }

        private void clearDeviceFormFactor() {
            this.bitField0_ &= -1025;
            this.deviceFormFactor_ = 0;
        }

        private void clearEnergySaving() {
            this.bitField0_ &= -513;
            this.energySaving_ = 0;
        }

        private void clearGpuOptimus() {
            this.bitField0_ &= -9;
            this.gpuOptimus_ = false;
        }

        private void clearMachineId() {
            this.bitField0_ &= -129;
            this.machineId_ = getDefaultInstance().getMachineId();
        }

        private void clearMetricaApiKey() {
            this.bitField0_ &= -17;
            this.metricaApiKey_ = getDefaultInstance().getMetricaApiKey();
        }

        private void clearPartnerId() {
            this.bitField0_ &= -33;
            this.partnerId_ = getDefaultInstance().getPartnerId();
        }

        private void clearUi() {
            this.bitField0_ &= -2;
            this.ui_ = getDefaultInstance().getUi();
        }

        private void clearUpdaterClid() {
            this.bitField0_ &= -65;
            this.updaterClid_ = getDefaultInstance().getUpdaterClid();
        }

        private void clearUuid() {
            this.bitField0_ &= -4097;
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static Yandex getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static s2 newBuilder() {
            return (s2) DEFAULT_INSTANCE.createBuilder();
        }

        public static Yandex parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Yandex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Yandex parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBrandId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.brandId_ = str;
        }

        private void setBrandIdBytes(ByteString byteString) {
            this.brandId_ = byteString.r();
            this.bitField0_ |= 2;
        }

        private void setBuild(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.build_ = str;
        }

        private void setBuildBytes(ByteString byteString) {
            this.build_ = byteString.r();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.clientVersion_ = str;
        }

        private void setClientVersionBytes(ByteString byteString) {
            this.clientVersion_ = byteString.r();
            this.bitField0_ |= 2048;
        }

        private void setDegradation(DegradationMode degradationMode) {
            this.degradation_ = degradationMode.getNumber();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceFormFactor(DeviceFormFactor deviceFormFactor) {
            this.deviceFormFactor_ = deviceFormFactor.getNumber();
            this.bitField0_ |= 1024;
        }

        private void setEnergySaving(EnergySavingMode energySavingMode) {
            this.energySaving_ = energySavingMode.getNumber();
            this.bitField0_ |= 512;
        }

        private void setGpuOptimus(boolean z) {
            this.bitField0_ |= 8;
            this.gpuOptimus_ = z;
        }

        private void setMachineId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.machineId_ = str;
        }

        private void setMachineIdBytes(ByteString byteString) {
            this.machineId_ = byteString.r();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetricaApiKey(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.metricaApiKey_ = str;
        }

        private void setMetricaApiKeyBytes(ByteString byteString) {
            this.metricaApiKey_ = byteString.r();
            this.bitField0_ |= 16;
        }

        private void setPartnerId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.partnerId_ = str;
        }

        private void setPartnerIdBytes(ByteString byteString) {
            this.partnerId_ = byteString.r();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUi(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.ui_ = str;
        }

        private void setUiBytes(ByteString byteString) {
            this.ui_ = byteString.r();
            this.bitField0_ |= 1;
        }

        private void setUpdaterClid(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.updaterClid_ = str;
        }

        private void setUpdaterClidBytes(ByteString byteString) {
            this.updaterClid_ = byteString.r();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.uuid_ = str;
        }

        private void setUuidBytes(ByteString byteString) {
            this.uuid_ = byteString.r();
            this.bitField0_ |= 4096;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Yandex();
                case 2:
                    return new s2(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\n᠌\b\u000b᠌\t\f᠌\n\rဈ\u000b\u000eဈ\f", new Object[]{"bitField0_", "ui_", "brandId_", "build_", "gpuOptimus_", "metricaApiKey_", "partnerId_", "updaterClid_", "machineId_", "degradation_", u2.a, "energySaving_", y2.a, "deviceFormFactor_", w2.a, "clientVersion_", "uuid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (Yandex.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public String getBrandId() {
            return this.brandId_;
        }

        public ByteString getBrandIdBytes() {
            return ByteString.g(this.brandId_);
        }

        public String getBuild() {
            return this.build_;
        }

        public ByteString getBuildBytes() {
            return ByteString.g(this.build_);
        }

        public String getClientVersion() {
            return this.clientVersion_;
        }

        public ByteString getClientVersionBytes() {
            return ByteString.g(this.clientVersion_);
        }

        public DegradationMode getDegradation() {
            DegradationMode a = DegradationMode.a(this.degradation_);
            return a == null ? DegradationMode.DEGRADATION_OFF : a;
        }

        public DeviceFormFactor getDeviceFormFactor() {
            DeviceFormFactor a = DeviceFormFactor.a(this.deviceFormFactor_);
            return a == null ? DeviceFormFactor.DEVICE_FORM_FACTOR_DESKTOP : a;
        }

        public EnergySavingMode getEnergySaving() {
            EnergySavingMode a = EnergySavingMode.a(this.energySaving_);
            return a == null ? EnergySavingMode.ENERGY_SAVING_OFF : a;
        }

        public boolean getGpuOptimus() {
            return this.gpuOptimus_;
        }

        public String getMachineId() {
            return this.machineId_;
        }

        public ByteString getMachineIdBytes() {
            return ByteString.g(this.machineId_);
        }

        public String getMetricaApiKey() {
            return this.metricaApiKey_;
        }

        public ByteString getMetricaApiKeyBytes() {
            return ByteString.g(this.metricaApiKey_);
        }

        public String getPartnerId() {
            return this.partnerId_;
        }

        public ByteString getPartnerIdBytes() {
            return ByteString.g(this.partnerId_);
        }

        public String getUi() {
            return this.ui_;
        }

        public ByteString getUiBytes() {
            return ByteString.g(this.ui_);
        }

        public String getUpdaterClid() {
            return this.updaterClid_;
        }

        public ByteString getUpdaterClidBytes() {
            return ByteString.g(this.updaterClid_);
        }

        public String getUuid() {
            return this.uuid_;
        }

        public ByteString getUuidBytes() {
            return ByteString.g(this.uuid_);
        }

        public boolean hasBrandId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasBuild() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientVersion() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasDegradation() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDeviceFormFactor() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasEnergySaving() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasGpuOptimus() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMachineId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasMetricaApiKey() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPartnerId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasUi() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUpdaterClid() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasUuid() {
            return (this.bitField0_ & 4096) != 0;
        }

        public static s2 newBuilder(Yandex yandex) {
            return (s2) DEFAULT_INSTANCE.createBuilder(yandex);
        }

        public static Yandex parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Yandex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Yandex parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static Yandex parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Yandex parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static Yandex parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Yandex parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static Yandex parseFrom(InputStream inputStream) throws IOException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Yandex parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Yandex parseFrom(eac eacVar) throws IOException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static Yandex parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (Yandex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class a extends GeneratedMessageLite implements m {
        private static final a DEFAULT_INSTANCE;
        private static volatile of90 PARSER = null;
        public static final int PRODUCT_NAME_FIELD_NUMBER = 1;
        public static final int PRODUCT_NAME_HASH_FIELD_NUMBER = 2;
        public static final int PRODUCT_STATE_FIELD_NUMBER = 5;
        public static final int PRODUCT_VERSION_FIELD_NUMBER = 3;
        public static final int PRODUCT_VERSION_HASH_FIELD_NUMBER = 4;
        private int bitField0_;
        private int productNameHash_;
        private int productState_;
        private int productVersionHash_;
        private String productName_ = "";
        private String productVersion_ = "";

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        private void clearProductName() {
            this.bitField0_ &= -2;
            this.productName_ = getDefaultInstance().getProductName();
        }

        private void clearProductNameHash() {
            this.bitField0_ &= -3;
            this.productNameHash_ = 0;
        }

        private void clearProductState() {
            this.bitField0_ &= -17;
            this.productState_ = 0;
        }

        private void clearProductVersion() {
            this.bitField0_ &= -5;
            this.productVersion_ = getDefaultInstance().getProductVersion();
        }

        private void clearProductVersionHash() {
            this.bitField0_ &= -9;
            this.productVersionHash_ = 0;
        }

        public static a getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static l newBuilder() {
            return (l) DEFAULT_INSTANCE.createBuilder();
        }

        public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static a parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setProductName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.productName_ = str;
        }

        private void setProductNameBytes(ByteString byteString) {
            this.productName_ = byteString.r();
            this.bitField0_ |= 1;
        }

        private void setProductNameHash(int i) {
            this.bitField0_ |= 2;
            this.productNameHash_ = i;
        }

        private void setProductState(AntiVirusState antiVirusState) {
            this.productState_ = antiVirusState.getNumber();
            this.bitField0_ |= 16;
        }

        private void setProductVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.productVersion_ = str;
        }

        private void setProductVersionBytes(ByteString byteString) {
            this.productVersion_ = byteString.r();
            this.bitField0_ |= 4;
        }

        private void setProductVersionHash(int i) {
            this.bitField0_ |= 8;
            this.productVersionHash_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new l();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဆ\u0001\u0003ဈ\u0002\u0004ဆ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "productName_", "productNameHash_", "productVersion_", "productVersionHash_", "productState_", o.a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (a.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public String getProductName() {
            return this.productName_;
        }

        public ByteString getProductNameBytes() {
            return ByteString.g(this.productName_);
        }

        public int getProductNameHash() {
            return this.productNameHash_;
        }

        public AntiVirusState getProductState() {
            AntiVirusState a = AntiVirusState.a(this.productState_);
            return a == null ? AntiVirusState.STATE_ON : a;
        }

        public String getProductVersion() {
            return this.productVersion_;
        }

        public ByteString getProductVersionBytes() {
            return ByteString.g(this.productVersion_);
        }

        public int getProductVersionHash() {
            return this.productVersionHash_;
        }

        public boolean hasProductName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasProductNameHash() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasProductState() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasProductVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasProductVersionHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public static l newBuilder(a aVar) {
            return (l) DEFAULT_INSTANCE.createBuilder(aVar);
        }

        public static a parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static a parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static a parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static a parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static a parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static a parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static a parseFrom(InputStream inputStream) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static a parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static a parseFrom(eac eacVar) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static a parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class b extends GeneratedMessageLite implements v {
        public static final int COHORT_HASH_FIELD_NUMBER = 4;
        public static final int COMPONENT_ID_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE;
        public static final int OMAHA_FINGERPRINT_FIELD_NUMBER = 3;
        private static volatile of90 PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cohortHash_;
        private int omahaFingerprint_;
        private int componentId_ = 1;
        private String version_ = "";

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        private void clearCohortHash() {
            this.bitField0_ &= -9;
            this.cohortHash_ = 0;
        }

        private void clearComponentId() {
            this.bitField0_ &= -2;
            this.componentId_ = 1;
        }

        private void clearOmahaFingerprint() {
            this.bitField0_ &= -5;
            this.omahaFingerprint_ = 0;
        }

        private void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        public static b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static u newBuilder() {
            return (u) DEFAULT_INSTANCE.createBuilder();
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (b) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCohortHash(int i) {
            this.bitField0_ |= 8;
            this.cohortHash_ = i;
        }

        private void setComponentId(ComponentId componentId) {
            this.componentId_ = componentId.getNumber();
            this.bitField0_ |= 1;
        }

        private void setOmahaFingerprint(int i) {
            this.bitField0_ |= 4;
            this.omahaFingerprint_ = i;
        }

        private void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        private void setVersionBytes(ByteString byteString) {
            this.version_ = byteString.r();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new u();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဆ\u0002\u0004ဆ\u0003", new Object[]{"bitField0_", "componentId_", a0.a, "version_", "omahaFingerprint_", "cohortHash_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (b.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public int getCohortHash() {
            return this.cohortHash_;
        }

        public ComponentId getComponentId() {
            ComponentId a = ComponentId.a(this.componentId_);
            return a == null ? ComponentId.UNKNOWN : a;
        }

        public int getOmahaFingerprint() {
            return this.omahaFingerprint_;
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.g(this.version_);
        }

        public boolean hasCohortHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasComponentId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOmahaFingerprint() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public static u newBuilder(b bVar) {
            return (u) DEFAULT_INSTANCE.createBuilder(bVar);
        }

        public static b parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (b) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static b parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static b parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static b parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static b parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static b parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static b parseFrom(eac eacVar) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static b parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends GeneratedMessageLite implements zt10 {
        public static final int CLONED_FROM_CLIENT_ID_FIELD_NUMBER = 2;
        public static final int COUNT_FIELD_NUMBER = 4;
        private static final c DEFAULT_INSTANCE;
        public static final int FIRST_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int LAST_TIMESTAMP_FIELD_NUMBER = 1;
        private static volatile of90 PARSER;
        private int bitField0_;
        private long clonedFromClientId_;
        private int count_;
        private long firstTimestamp_;
        private long lastTimestamp_;

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        private c() {
        }

        private void clearClonedFromClientId() {
            this.bitField0_ &= -3;
            this.clonedFromClientId_ = 0L;
        }

        private void clearCount() {
            this.bitField0_ &= -9;
            this.count_ = 0;
        }

        private void clearFirstTimestamp() {
            this.bitField0_ &= -5;
            this.firstTimestamp_ = 0L;
        }

        private void clearLastTimestamp() {
            this.bitField0_ &= -2;
            this.lastTimestamp_ = 0L;
        }

        public static c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static y newBuilder() {
            return (y) DEFAULT_INSTANCE.createBuilder();
        }

        public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (c) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static c parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClonedFromClientId(long j) {
            this.bitField0_ |= 2;
            this.clonedFromClientId_ = j;
        }

        private void setCount(int i) {
            this.bitField0_ |= 8;
            this.count_ = i;
        }

        private void setFirstTimestamp(long j) {
            this.bitField0_ |= 4;
            this.firstTimestamp_ = j;
        }

        private void setLastTimestamp(long j) {
            this.bitField0_ |= 1;
            this.lastTimestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new y(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002စ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"bitField0_", "lastTimestamp_", "clonedFromClientId_", "firstTimestamp_", "count_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (c.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public long getClonedFromClientId() {
            return this.clonedFromClientId_;
        }

        public int getCount() {
            return this.count_;
        }

        public long getFirstTimestamp() {
            return this.firstTimestamp_;
        }

        public long getLastTimestamp() {
            return this.lastTimestamp_;
        }

        public boolean hasClonedFromClientId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFirstTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLastTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        public static y newBuilder(c cVar) {
            return (y) DEFAULT_INSTANCE.createBuilder(cVar);
        }

        public static c parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (c) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static c parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static c parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static c parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static c parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static c parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static c parseFrom(InputStream inputStream) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static c parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static c parseFrom(eac eacVar) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static c parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends GeneratedMessageLite implements zt10 {
        private static final d DEFAULT_INSTANCE;
        public static final int DEVICE_NAME_FIELD_NUMBER = 4;
        public static final int MANUFACTURER_FIELD_NUMBER = 1;
        public static final int MODEL_NAME_FIELD_NUMBER = 2;
        public static final int MODEL_NUMBER_FIELD_NUMBER = 3;
        private static volatile of90 PARSER;
        private int bitField0_;
        private String manufacturer_ = "";
        private String modelName_ = "";
        private String modelNumber_ = "";
        private String deviceName_ = "";

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
        }

        private d() {
        }

        private void clearDeviceName() {
            this.bitField0_ &= -9;
            this.deviceName_ = getDefaultInstance().getDeviceName();
        }

        private void clearManufacturer() {
            this.bitField0_ &= -2;
            this.manufacturer_ = getDefaultInstance().getManufacturer();
        }

        private void clearModelName() {
            this.bitField0_ &= -3;
            this.modelName_ = getDefaultInstance().getModelName();
        }

        private void clearModelNumber() {
            this.bitField0_ &= -5;
            this.modelNumber_ = getDefaultInstance().getModelNumber();
        }

        public static d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static i0 newBuilder() {
            return (i0) DEFAULT_INSTANCE.createBuilder();
        }

        public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (d) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static d parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDeviceName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.deviceName_ = str;
        }

        private void setDeviceNameBytes(ByteString byteString) {
            this.deviceName_ = byteString.r();
            this.bitField0_ |= 8;
        }

        private void setManufacturer(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.manufacturer_ = str;
        }

        private void setManufacturerBytes(ByteString byteString) {
            this.manufacturer_ = byteString.r();
            this.bitField0_ |= 1;
        }

        private void setModelName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.modelName_ = str;
        }

        private void setModelNameBytes(ByteString byteString) {
            this.modelName_ = byteString.r();
            this.bitField0_ |= 2;
        }

        private void setModelNumber(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.modelNumber_ = str;
        }

        private void setModelNumberBytes(ByteString byteString) {
            this.modelNumber_ = byteString.r();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new i0(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "manufacturer_", "modelName_", "modelNumber_", "deviceName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (d.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public String getDeviceName() {
            return this.deviceName_;
        }

        public ByteString getDeviceNameBytes() {
            return ByteString.g(this.deviceName_);
        }

        public String getManufacturer() {
            return this.manufacturer_;
        }

        public ByteString getManufacturerBytes() {
            return ByteString.g(this.manufacturer_);
        }

        public String getModelName() {
            return this.modelName_;
        }

        public ByteString getModelNameBytes() {
            return ByteString.g(this.modelName_);
        }

        public String getModelNumber() {
            return this.modelNumber_;
        }

        public ByteString getModelNumberBytes() {
            return ByteString.g(this.modelNumber_);
        }

        public boolean hasDeviceName() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasManufacturer() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasModelName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasModelNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        public static i0 newBuilder(d dVar) {
            return (i0) DEFAULT_INSTANCE.createBuilder(dVar);
        }

        public static d parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (d) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static d parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static d parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static d parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static d parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static d parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static d parseFrom(InputStream inputStream) throws IOException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static d parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static d parseFrom(eac eacVar) throws IOException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static d parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class e extends GeneratedMessageLite implements q3x0 {
        private static final e DEFAULT_INSTANCE;
        public static final int GROUP_ID_FIELD_NUMBER = 2;
        public static final int NAME_ID_FIELD_NUMBER = 1;
        private static volatile of90 PARSER;
        private int bitField0_;
        private int groupId_;
        private int nameId_;

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
        }

        private e() {
        }

        private void clearGroupId() {
            this.bitField0_ &= -3;
            this.groupId_ = 0;
        }

        private void clearNameId() {
            this.bitField0_ &= -2;
            this.nameId_ = 0;
        }

        public static e getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static y0 newBuilder() {
            return (y0) DEFAULT_INSTANCE.createBuilder();
        }

        public static e parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (e) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static e parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupId(int i) {
            this.bitField0_ |= 2;
            this.groupId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameId(int i) {
            this.bitField0_ |= 1;
            this.nameId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new y0(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"bitField0_", "nameId_", "groupId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (e.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs(DEFAULT_INSTANCE);
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public int getGroupId() {
            return this.groupId_;
        }

        public int getNameId() {
            return this.nameId_;
        }

        public boolean hasGroupId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNameId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static y0 newBuilder(e eVar) {
            return (y0) DEFAULT_INSTANCE.createBuilder(eVar);
        }

        public static e parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (e) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static e parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static e parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static e parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static e parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static e parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static e parseFrom(InputStream inputStream) throws IOException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static e parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static e parseFrom(eac eacVar) throws IOException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static e parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends GeneratedMessageLite implements zt10 {
        private static final f DEFAULT_INSTANCE;
        public static final int IS_INSTANT_TETHERING_ENABLED_FIELD_NUMBER = 3;
        public static final int IS_MESSAGES_ENABLED_FIELD_NUMBER = 4;
        public static final int IS_SMARTLOCK_ENABLED_FIELD_NUMBER = 2;
        private static volatile of90 PARSER = null;
        public static final int PHONE_MODEL_NAME_HASH_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean isInstantTetheringEnabled_;
        private boolean isMessagesEnabled_;
        private boolean isSmartlockEnabled_;
        private int phoneModelNameHash_;

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
        }

        private f() {
        }

        private void clearIsInstantTetheringEnabled() {
            this.bitField0_ &= -5;
            this.isInstantTetheringEnabled_ = false;
        }

        private void clearIsMessagesEnabled() {
            this.bitField0_ &= -9;
            this.isMessagesEnabled_ = false;
        }

        private void clearIsSmartlockEnabled() {
            this.bitField0_ &= -3;
            this.isSmartlockEnabled_ = false;
        }

        private void clearPhoneModelNameHash() {
            this.bitField0_ &= -2;
            this.phoneModelNameHash_ = 0;
        }

        public static f getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static y1 newBuilder() {
            return (y1) DEFAULT_INSTANCE.createBuilder();
        }

        public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (f) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static f parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsInstantTetheringEnabled(boolean z) {
            this.bitField0_ |= 4;
            this.isInstantTetheringEnabled_ = z;
        }

        private void setIsMessagesEnabled(boolean z) {
            this.bitField0_ |= 8;
            this.isMessagesEnabled_ = z;
        }

        private void setIsSmartlockEnabled(boolean z) {
            this.bitField0_ |= 2;
            this.isSmartlockEnabled_ = z;
        }

        private void setPhoneModelNameHash(int i) {
            this.bitField0_ |= 1;
            this.phoneModelNameHash_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new y1(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "phoneModelNameHash_", "isSmartlockEnabled_", "isInstantTetheringEnabled_", "isMessagesEnabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (f.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public boolean getIsInstantTetheringEnabled() {
            return this.isInstantTetheringEnabled_;
        }

        @Deprecated
        public boolean getIsMessagesEnabled() {
            return this.isMessagesEnabled_;
        }

        public boolean getIsSmartlockEnabled() {
            return this.isSmartlockEnabled_;
        }

        public int getPhoneModelNameHash() {
            return this.phoneModelNameHash_;
        }

        public boolean hasIsInstantTetheringEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Deprecated
        public boolean hasIsMessagesEnabled() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIsSmartlockEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPhoneModelNameHash() {
            return (this.bitField0_ & 1) != 0;
        }

        public static y1 newBuilder(f fVar) {
            return (y1) DEFAULT_INSTANCE.createBuilder(fVar);
        }

        public static f parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (f) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static f parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static f parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static f parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static f parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static f parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static f parseFrom(InputStream inputStream) throws IOException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static f parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static f parseFrom(eac eacVar) throws IOException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static f parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (f) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends GeneratedMessageLite implements zt10 {
        public static final int CRASH_COUNT_DUE_TO_GMS_CORE_UPDATE_FIELD_NUMBER = 30;
        private static final g DEFAULT_INSTANCE;
        public static final int FROM_PREVIOUS_RUN_FIELD_NUMBER = 29;
        public static final int KERNEL_CRASH_COUNT_FIELD_NUMBER = 8;
        public static final int LAUNCH_COUNT_FIELD_NUMBER = 15;
        public static final int OTHER_USER_CRASH_COUNT_FIELD_NUMBER = 7;
        public static final int PAGE_LOAD_COUNT_FIELD_NUMBER = 2;
        private static volatile of90 PARSER = null;
        public static final int RENDERER_LAUNCH_COUNT_FIELD_NUMBER = 26;
        public static final int UNCLEAN_SYSTEM_SHUTDOWN_COUNT_FIELD_NUMBER = 9;
        private int bitField0_;
        private int crashCountDueToGmsCoreUpdate_;
        private boolean fromPreviousRun_;
        private int kernelCrashCount_;
        private int launchCount_;
        private int otherUserCrashCount_;
        private int pageLoadCount_;
        private int rendererLaunchCount_;
        private int uncleanSystemShutdownCount_;

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
        }

        private g() {
        }

        private void clearCrashCountDueToGmsCoreUpdate() {
            this.bitField0_ &= -65;
            this.crashCountDueToGmsCoreUpdate_ = 0;
        }

        private void clearFromPreviousRun() {
            this.bitField0_ &= -129;
            this.fromPreviousRun_ = false;
        }

        private void clearKernelCrashCount() {
            this.bitField0_ &= -9;
            this.kernelCrashCount_ = 0;
        }

        private void clearLaunchCount() {
            this.bitField0_ &= -33;
            this.launchCount_ = 0;
        }

        private void clearOtherUserCrashCount() {
            this.bitField0_ &= -5;
            this.otherUserCrashCount_ = 0;
        }

        private void clearPageLoadCount() {
            this.bitField0_ &= -2;
            this.pageLoadCount_ = 0;
        }

        private void clearRendererLaunchCount() {
            this.bitField0_ &= -3;
            this.rendererLaunchCount_ = 0;
        }

        private void clearUncleanSystemShutdownCount() {
            this.bitField0_ &= -17;
            this.uncleanSystemShutdownCount_ = 0;
        }

        public static g getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static o2 newBuilder() {
            return (o2) DEFAULT_INSTANCE.createBuilder();
        }

        public static g parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (g) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static g parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCrashCountDueToGmsCoreUpdate(int i) {
            this.bitField0_ |= 64;
            this.crashCountDueToGmsCoreUpdate_ = i;
        }

        private void setFromPreviousRun(boolean z) {
            this.bitField0_ |= 128;
            this.fromPreviousRun_ = z;
        }

        private void setKernelCrashCount(int i) {
            this.bitField0_ |= 8;
            this.kernelCrashCount_ = i;
        }

        private void setLaunchCount(int i) {
            this.bitField0_ |= 32;
            this.launchCount_ = i;
        }

        private void setOtherUserCrashCount(int i) {
            this.bitField0_ |= 4;
            this.otherUserCrashCount_ = i;
        }

        private void setPageLoadCount(int i) {
            this.bitField0_ |= 1;
            this.pageLoadCount_ = i;
        }

        private void setRendererLaunchCount(int i) {
            this.bitField0_ |= 2;
            this.rendererLaunchCount_ = i;
        }

        private void setUncleanSystemShutdownCount(int i) {
            this.bitField0_ |= 16;
            this.uncleanSystemShutdownCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new o2(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0002\u001e\b\u0000\u0000\u0000\u0002င\u0000\u0007င\u0002\bင\u0003\tင\u0004\u000fင\u0005\u001aင\u0001\u001dဇ\u0007\u001eင\u0006", new Object[]{"bitField0_", "pageLoadCount_", "otherUserCrashCount_", "kernelCrashCount_", "uncleanSystemShutdownCount_", "launchCount_", "rendererLaunchCount_", "fromPreviousRun_", "crashCountDueToGmsCoreUpdate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (g.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public int getCrashCountDueToGmsCoreUpdate() {
            return this.crashCountDueToGmsCoreUpdate_;
        }

        public boolean getFromPreviousRun() {
            return this.fromPreviousRun_;
        }

        public int getKernelCrashCount() {
            return this.kernelCrashCount_;
        }

        public int getLaunchCount() {
            return this.launchCount_;
        }

        public int getOtherUserCrashCount() {
            return this.otherUserCrashCount_;
        }

        public int getPageLoadCount() {
            return this.pageLoadCount_;
        }

        public int getRendererLaunchCount() {
            return this.rendererLaunchCount_;
        }

        public int getUncleanSystemShutdownCount() {
            return this.uncleanSystemShutdownCount_;
        }

        public boolean hasCrashCountDueToGmsCoreUpdate() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasFromPreviousRun() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasKernelCrashCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasLaunchCount() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasOtherUserCrashCount() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPageLoadCount() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasRendererLaunchCount() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasUncleanSystemShutdownCount() {
            return (this.bitField0_ & 16) != 0;
        }

        public static o2 newBuilder(g gVar) {
            return (o2) DEFAULT_INSTANCE.createBuilder(gVar);
        }

        public static g parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (g) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static g parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static g parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static g parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static g parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static g parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static g parseFrom(InputStream inputStream) throws IOException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static g parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static g parseFrom(eac eacVar) throws IOException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static g parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends GeneratedMessageLite implements zt10 {
        private static final h DEFAULT_INSTANCE;
        public static final int MANUFACTURER_ID_FIELD_NUMBER = 1;
        public static final int MANUFACTURER_VERSION_FIELD_NUMBER = 2;
        public static final int MANUFACTURER_VERSION_HASH_FIELD_NUMBER = 3;
        public static final int MANUFACTURER_VERSION_INFO_FIELD_NUMBER = 4;
        public static final int MANUFACTURER_VERSION_INFO_HASH_FIELD_NUMBER = 5;
        private static volatile of90 PARSER = null;
        public static final int TPM_SPECIFIC_VERSION_FIELD_NUMBER = 6;
        public static final int TPM_SPECIFIC_VERSION_HASH_FIELD_NUMBER = 7;
        private int bitField0_;
        private int manufacturerId_;
        private int manufacturerVersionHash_;
        private int manufacturerVersionInfoHash_;
        private int tpmSpecificVersionHash_;
        private String manufacturerVersion_ = "";
        private String manufacturerVersionInfo_ = "";
        private String tpmSpecificVersion_ = "";

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
        }

        private h() {
        }

        private void clearManufacturerId() {
            this.bitField0_ &= -2;
            this.manufacturerId_ = 0;
        }

        private void clearManufacturerVersion() {
            this.bitField0_ &= -3;
            this.manufacturerVersion_ = getDefaultInstance().getManufacturerVersion();
        }

        private void clearManufacturerVersionHash() {
            this.bitField0_ &= -5;
            this.manufacturerVersionHash_ = 0;
        }

        private void clearManufacturerVersionInfo() {
            this.bitField0_ &= -9;
            this.manufacturerVersionInfo_ = getDefaultInstance().getManufacturerVersionInfo();
        }

        private void clearManufacturerVersionInfoHash() {
            this.bitField0_ &= -17;
            this.manufacturerVersionInfoHash_ = 0;
        }

        private void clearTpmSpecificVersion() {
            this.bitField0_ &= -33;
            this.tpmSpecificVersion_ = getDefaultInstance().getTpmSpecificVersion();
        }

        private void clearTpmSpecificVersionHash() {
            this.bitField0_ &= -65;
            this.tpmSpecificVersionHash_ = 0;
        }

        public static h getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static p2 newBuilder() {
            return (p2) DEFAULT_INSTANCE.createBuilder();
        }

        public static h parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (h) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static h parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setManufacturerId(int i) {
            this.bitField0_ |= 1;
            this.manufacturerId_ = i;
        }

        private void setManufacturerVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.manufacturerVersion_ = str;
        }

        private void setManufacturerVersionBytes(ByteString byteString) {
            this.manufacturerVersion_ = byteString.r();
            this.bitField0_ |= 2;
        }

        private void setManufacturerVersionHash(int i) {
            this.bitField0_ |= 4;
            this.manufacturerVersionHash_ = i;
        }

        private void setManufacturerVersionInfo(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.manufacturerVersionInfo_ = str;
        }

        private void setManufacturerVersionInfoBytes(ByteString byteString) {
            this.manufacturerVersionInfo_ = byteString.r();
            this.bitField0_ |= 8;
        }

        private void setManufacturerVersionInfoHash(int i) {
            this.bitField0_ |= 16;
            this.manufacturerVersionInfoHash_ = i;
        }

        private void setTpmSpecificVersion(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.tpmSpecificVersion_ = str;
        }

        private void setTpmSpecificVersionBytes(ByteString byteString) {
            this.tpmSpecificVersion_ = byteString.r();
            this.bitField0_ |= 32;
        }

        private void setTpmSpecificVersionHash(int i) {
            this.bitField0_ |= 64;
            this.tpmSpecificVersionHash_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (p3x0.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new p2(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဈ\u0001\u0003ဆ\u0002\u0004ဈ\u0003\u0005ဆ\u0004\u0006ဈ\u0005\u0007ဆ\u0006", new Object[]{"bitField0_", "manufacturerId_", "manufacturerVersion_", "manufacturerVersionHash_", "manufacturerVersionInfo_", "manufacturerVersionInfoHash_", "tpmSpecificVersion_", "tpmSpecificVersionHash_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (h.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        public int getManufacturerId() {
            return this.manufacturerId_;
        }

        public String getManufacturerVersion() {
            return this.manufacturerVersion_;
        }

        public ByteString getManufacturerVersionBytes() {
            return ByteString.g(this.manufacturerVersion_);
        }

        public int getManufacturerVersionHash() {
            return this.manufacturerVersionHash_;
        }

        public String getManufacturerVersionInfo() {
            return this.manufacturerVersionInfo_;
        }

        public ByteString getManufacturerVersionInfoBytes() {
            return ByteString.g(this.manufacturerVersionInfo_);
        }

        public int getManufacturerVersionInfoHash() {
            return this.manufacturerVersionInfoHash_;
        }

        public String getTpmSpecificVersion() {
            return this.tpmSpecificVersion_;
        }

        public ByteString getTpmSpecificVersionBytes() {
            return ByteString.g(this.tpmSpecificVersion_);
        }

        public int getTpmSpecificVersionHash() {
            return this.tpmSpecificVersionHash_;
        }

        public boolean hasManufacturerId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasManufacturerVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasManufacturerVersionHash() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasManufacturerVersionInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasManufacturerVersionInfoHash() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTpmSpecificVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTpmSpecificVersionHash() {
            return (this.bitField0_ & 64) != 0;
        }

        public static p2 newBuilder(h hVar) {
            return (p2) DEFAULT_INSTANCE.createBuilder(hVar);
        }

        public static h parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (h) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static h parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static h parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static h parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static h parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static h parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static h parseFrom(InputStream inputStream) throws IOException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static h parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static h parseFrom(eac eacVar) throws IOException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static h parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static r newBuilder(SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto) {
        return (r) DEFAULT_INSTANCE.createBuilder(systemProfileProtos$SystemProfileProto);
    }

    public static SystemProfileProtos$SystemProfileProto parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    private void addAntivirusProduct(int i, a aVar) {
        aVar.getClass();
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.add(i, aVar);
    }

    private void addChromeComponent(int i, b bVar) {
        bVar.getClass();
        ensureChromeComponentIsMutable();
        this.chromeComponent_.add(i, bVar);
    }

    private void addExternalAudioVideoDevice(int i, ExternalAudioVideoDevice externalAudioVideoDevice) {
        externalAudioVideoDevice.getClass();
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.add(i, externalAudioVideoDevice);
    }

    private void addFieldTrial(int i, e eVar) {
        eVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(i, eVar);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(InputStream inputStream) throws IOException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(eac eacVar) throws IOException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static SystemProfileProtos$SystemProfileProto parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (SystemProfileProtos$SystemProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
