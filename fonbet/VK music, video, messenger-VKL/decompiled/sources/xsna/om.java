package xsna;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.stat.accessibility.settings.display.color.correction.daltonizer.DaltonizerData$Mode;
import com.vk.stat.accessibility.settings.display.color.correction.mode.ColorModeData$Mode;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ezi;
import xsna.om;

/* compiled from: AccessibilitySettingsReporter.kt */
/* loaded from: classes11.dex */
public final class om {
    public static final om a;
    public static final io.reactivex.rxjava3.subjects.d<Context> b;

    /* compiled from: AccessibilitySettingsReporter.kt */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ColorModeData$Mode.values().length];
            try {
                iArr[ColorModeData$Mode.Natural.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorModeData$Mode.Boosted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorModeData$Mode.Saturated.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorModeData$Mode.Automatic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DaltonizerData$Mode.values().length];
            try {
                iArr2[DaltonizerData$Mode.Protanomaly.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DaltonizerData$Mode.Deuteranomaly.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DaltonizerData$Mode.Tritanomaly.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: AccessibilitySettingsReporter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Context, io.reactivex.rxjava3.core.x<MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem>> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.x<MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem> invoke(Context context) {
            final Context context2 = context;
            om omVar = (om) this.receiver;
            om omVar2 = om.a;
            omVar.getClass();
            return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.nm
                /* JADX WARN: Can't wrap try/catch for region: R(170:0|1|(4:2|3|(1:369)(1:9)|10)|(1:12)(1:367)|13|(4:14|15|(1:17)|18)|19|(4:20|21|(1:23)|24)|(2:26|27)|(161:31|32|33|35|36|(3:38|(1:40)(0)|41)|357|358|41|42|(1:44)(1:354)|45|46|47|48|(1:50)(1:351)|51|52|53|54|(3:56|(1:58)(0)|59)|347|348|59|60|(1:62)(1:344)|63|64|65|66|(1:68)(1:341)|69|70|71|72|(1:74)(1:338)|75|76|77|78|(1:80)(1:335)|81|83|84|85|86|87|(115:89|90|91|92|93|94|95|(1:97)|98|99|100|101|102|103|104|(98:106|107|108|(1:110)(1:318)|111|113|114|116|117|118|119|120|(1:122)(1:312)|123|124|125|126|127|128|(1:130)(1:306)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(1:147)(1:294)|148|150|151|152|153|154|(1:156)(1:289)|157|158|159|160|(1:162)(1:286)|163|165|166|168|169|170|171|172|(1:174)|175|176|177|(1:179)(1:279)|180|181|182|183|184|185|(1:187)(1:274)|188|189|190|191|(1:271)(1:195)|196|197|198|199|(5:201|202|203|204|(21:206|207|208|209|210|211|(1:213)(1:261)|214|216|217|(1:219)(1:259)|220|221|222|(1:224)|225|226|(2:228|(1:(1:(2:232|(1:234)(2:250|251))(1:252))(1:253))(1:254))(1:255)|(3:236|(1:(1:(1:240)(2:245|246))(1:247))(1:248)|241)(1:249)|242|243))(1:268)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(1:193)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|361|35|36|(0)|357|358|41|42|(0)(0)|45|46|47|48|(0)(0)|51|52|53|54|(0)|347|348|59|60|(0)(0)|63|64|65|66|(0)(0)|69|70|71|72|(0)(0)|75|76|77|78|(0)(0)|81|83|84|85|86|87|(0)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243|(1:(0))) */
                /* JADX WARN: Can't wrap try/catch for region: R(173:0|1|(4:2|3|(1:369)(1:9)|10)|(1:12)(1:367)|13|14|15|(1:17)|18|19|(4:20|21|(1:23)|24)|(2:26|27)|(161:31|32|33|35|36|(3:38|(1:40)(0)|41)|357|358|41|42|(1:44)(1:354)|45|46|47|48|(1:50)(1:351)|51|52|53|54|(3:56|(1:58)(0)|59)|347|348|59|60|(1:62)(1:344)|63|64|65|66|(1:68)(1:341)|69|70|71|72|(1:74)(1:338)|75|76|77|78|(1:80)(1:335)|81|83|84|85|86|87|(115:89|90|91|92|93|94|95|(1:97)|98|99|100|101|102|103|104|(98:106|107|108|(1:110)(1:318)|111|113|114|116|117|118|119|120|(1:122)(1:312)|123|124|125|126|127|128|(1:130)(1:306)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(1:147)(1:294)|148|150|151|152|153|154|(1:156)(1:289)|157|158|159|160|(1:162)(1:286)|163|165|166|168|169|170|171|172|(1:174)|175|176|177|(1:179)(1:279)|180|181|182|183|184|185|(1:187)(1:274)|188|189|190|191|(1:271)(1:195)|196|197|198|199|(5:201|202|203|204|(21:206|207|208|209|210|211|(1:213)(1:261)|214|216|217|(1:219)(1:259)|220|221|222|(1:224)|225|226|(2:228|(1:(1:(2:232|(1:234)(2:250|251))(1:252))(1:253))(1:254))(1:255)|(3:236|(1:(1:(1:240)(2:245|246))(1:247))(1:248)|241)(1:249)|242|243))(1:268)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(1:193)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|361|35|36|(0)|357|358|41|42|(0)(0)|45|46|47|48|(0)(0)|51|52|53|54|(0)|347|348|59|60|(0)(0)|63|64|65|66|(0)(0)|69|70|71|72|(0)(0)|75|76|77|78|(0)(0)|81|83|84|85|86|87|(0)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243|(1:(0))) */
                /* JADX WARN: Can't wrap try/catch for region: R(179:0|1|2|3|(1:369)(1:9)|10|(1:12)(1:367)|13|14|15|(1:17)|18|19|20|21|(1:23)|24|(2:26|27)|(161:31|32|33|35|36|(3:38|(1:40)(0)|41)|357|358|41|42|(1:44)(1:354)|45|46|47|48|(1:50)(1:351)|51|52|53|54|(3:56|(1:58)(0)|59)|347|348|59|60|(1:62)(1:344)|63|64|65|66|(1:68)(1:341)|69|70|71|72|(1:74)(1:338)|75|76|77|78|(1:80)(1:335)|81|83|84|85|86|87|(115:89|90|91|92|93|94|95|(1:97)|98|99|100|101|102|103|104|(98:106|107|108|(1:110)(1:318)|111|113|114|116|117|118|119|120|(1:122)(1:312)|123|124|125|126|127|128|(1:130)(1:306)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(1:147)(1:294)|148|150|151|152|153|154|(1:156)(1:289)|157|158|159|160|(1:162)(1:286)|163|165|166|168|169|170|171|172|(1:174)|175|176|177|(1:179)(1:279)|180|181|182|183|184|185|(1:187)(1:274)|188|189|190|191|(1:271)(1:195)|196|197|198|199|(5:201|202|203|204|(21:206|207|208|209|210|211|(1:213)(1:261)|214|216|217|(1:219)(1:259)|220|221|222|(1:224)|225|226|(2:228|(1:(1:(2:232|(1:234)(2:250|251))(1:252))(1:253))(1:254))(1:255)|(3:236|(1:(1:(1:240)(2:245|246))(1:247))(1:248)|241)(1:249)|242|243))(1:268)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(1:193)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|361|35|36|(0)|357|358|41|42|(0)(0)|45|46|47|48|(0)(0)|51|52|53|54|(0)|347|348|59|60|(0)(0)|63|64|65|66|(0)(0)|69|70|71|72|(0)(0)|75|76|77|78|(0)(0)|81|83|84|85|86|87|(0)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243|(1:(0))) */
                /* JADX WARN: Can't wrap try/catch for region: R(180:0|1|2|3|(1:369)(1:9)|10|(1:12)(1:367)|13|14|15|(1:17)|18|19|20|21|(1:23)|24|26|27|(161:31|32|33|35|36|(3:38|(1:40)(0)|41)|357|358|41|42|(1:44)(1:354)|45|46|47|48|(1:50)(1:351)|51|52|53|54|(3:56|(1:58)(0)|59)|347|348|59|60|(1:62)(1:344)|63|64|65|66|(1:68)(1:341)|69|70|71|72|(1:74)(1:338)|75|76|77|78|(1:80)(1:335)|81|83|84|85|86|87|(115:89|90|91|92|93|94|95|(1:97)|98|99|100|101|102|103|104|(98:106|107|108|(1:110)(1:318)|111|113|114|116|117|118|119|120|(1:122)(1:312)|123|124|125|126|127|128|(1:130)(1:306)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(1:147)(1:294)|148|150|151|152|153|154|(1:156)(1:289)|157|158|159|160|(1:162)(1:286)|163|165|166|168|169|170|171|172|(1:174)|175|176|177|(1:179)(1:279)|180|181|182|183|184|185|(1:187)(1:274)|188|189|190|191|(1:271)(1:195)|196|197|198|199|(5:201|202|203|204|(21:206|207|208|209|210|211|(1:213)(1:261)|214|216|217|(1:219)(1:259)|220|221|222|(1:224)|225|226|(2:228|(1:(1:(2:232|(1:234)(2:250|251))(1:252))(1:253))(1:254))(1:255)|(3:236|(1:(1:(1:240)(2:245|246))(1:247))(1:248)|241)(1:249)|242|243))(1:268)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(1:193)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243)|361|35|36|(0)|357|358|41|42|(0)(0)|45|46|47|48|(0)(0)|51|52|53|54|(0)|347|348|59|60|(0)(0)|63|64|65|66|(0)(0)|69|70|71|72|(0)(0)|75|76|77|78|(0)(0)|81|83|84|85|86|87|(0)|330|92|93|94|95|(0)|98|99|100|101|102|103|104|(0)|321|107|108|(0)(0)|111|113|114|116|117|118|119|120|(0)(0)|123|124|125|126|127|128|(0)(0)|131|132|133|134|135|136|137|138|139|140|141|142|144|145|(0)(0)|148|150|151|152|153|154|(0)(0)|157|158|159|160|(0)(0)|163|165|166|168|169|170|171|172|(0)|175|176|177|(0)(0)|180|181|182|183|184|185|(0)(0)|188|189|190|191|(0)|271|196|197|198|199|(0)(0)|264|207|208|209|210|211|(0)(0)|214|216|217|(0)(0)|220|221|222|(0)|225|226|(0)(0)|(0)(0)|242|243|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:257:0x0427, code lost:
                
                    r4 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:260:0x0414, code lost:
                
                    r3 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:262:0x03fe, code lost:
                
                    r1 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:269:0x03d7, code lost:
                
                    r13 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:272:0x03b7, code lost:
                
                    r36 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:275:0x038f, code lost:
                
                    r38 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:277:0x036f, code lost:
                
                    r1 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:280:0x035a, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:282:0x0332, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:284:0x031f, code lost:
                
                    r13 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:285:0x030c, code lost:
                
                    r11 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:287:0x02f9, code lost:
                
                    r3 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:291:0x02db, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:293:0x02d9, code lost:
                
                    r33 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:295:0x02c1, code lost:
                
                    r13 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:297:0x02ab, code lost:
                
                    r3 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:299:0x02a9, code lost:
                
                    r32 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:302:0x0294, code lost:
                
                    r11 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:304:0x0292, code lost:
                
                    r31 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:308:0x0267, code lost:
                
                    r14 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:310:0x0265, code lost:
                
                    r26 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:314:0x024d, code lost:
                
                    r13 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:316:0x024b, code lost:
                
                    r25 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:317:0x0233, code lost:
                
                    r3 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:319:0x0223, code lost:
                
                    r11 = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:324:0x020b, code lost:
                
                    r23 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:325:0x0209, code lost:
                
                    r3 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:327:0x01db, code lost:
                
                    r12 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:332:0x01b4, code lost:
                
                    r6 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:334:0x019e, code lost:
                
                    r6 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:336:0x0189, code lost:
                
                    r5 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:339:0x0173, code lost:
                
                    r21 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:342:0x015b, code lost:
                
                    r19 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:345:0x0143, code lost:
                
                    r18 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:352:0x010c, code lost:
                
                    r17 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:355:0x00f4, code lost:
                
                    r22 = null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0204 A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #24 {all -> 0x0207, blocks: (B:104:0x01f4, B:106:0x0204), top: B:103:0x01f4 }] */
                /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x0243  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x025d  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x02d1  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x02f1  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x033b  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x0352  */
                /* JADX WARN: Removed duplicated region for block: B:187:0x0385  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x039c A[Catch: all -> 0x03b7, TryCatch #15 {all -> 0x03b7, blocks: (B:191:0x0391, B:193:0x039c, B:196:0x03b0), top: B:190:0x0391 }] */
                /* JADX WARN: Removed duplicated region for block: B:201:0x03c4 A[Catch: all -> 0x03d7, TRY_LEAVE, TryCatch #36 {all -> 0x03d7, blocks: (B:199:0x03b9, B:201:0x03c4), top: B:198:0x03b9 }] */
                /* JADX WARN: Removed duplicated region for block: B:213:0x03f6  */
                /* JADX WARN: Removed duplicated region for block: B:219:0x040c  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x0421  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x0435  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x045f  */
                /* JADX WARN: Removed duplicated region for block: B:249:0x0482  */
                /* JADX WARN: Removed duplicated region for block: B:255:0x045c  */
                /* JADX WARN: Removed duplicated region for block: B:259:0x040e  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x03f8  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x03d9  */
                /* JADX WARN: Removed duplicated region for block: B:274:0x0387  */
                /* JADX WARN: Removed duplicated region for block: B:279:0x0354  */
                /* JADX WARN: Removed duplicated region for block: B:286:0x02f3  */
                /* JADX WARN: Removed duplicated region for block: B:289:0x02d3  */
                /* JADX WARN: Removed duplicated region for block: B:294:0x02bb  */
                /* JADX WARN: Removed duplicated region for block: B:306:0x025f  */
                /* JADX WARN: Removed duplicated region for block: B:312:0x0245  */
                /* JADX WARN: Removed duplicated region for block: B:318:0x021d  */
                /* JADX WARN: Removed duplicated region for block: B:335:0x0183  */
                /* JADX WARN: Removed duplicated region for block: B:338:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:341:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:344:0x013b  */
                /* JADX WARN: Removed duplicated region for block: B:351:0x0104  */
                /* JADX WARN: Removed duplicated region for block: B:354:0x00ec  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #42 {all -> 0x00dd, blocks: (B:36:0x00be, B:38:0x00d0), top: B:35:0x00be }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #8 {all -> 0x012c, blocks: (B:54:0x010e, B:56:0x0120), top: B:53:0x010e }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
                /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    Boolean bool;
                    Integer num;
                    Integer num2;
                    Integer num3;
                    Float f;
                    Integer num4;
                    Float f2;
                    Float f3;
                    Boolean bool2;
                    ColorModeData$Mode colorModeData$Mode;
                    DaltonizerData$Mode daltonizerData$Mode;
                    Boolean bool3;
                    boolean z;
                    Boolean bool4;
                    MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.ColorMode colorMode;
                    MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.DaltonizerMode daltonizerMode;
                    MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.DaltonizerMode daltonizerMode2;
                    boolean z2;
                    Object invoke;
                    om omVar3 = om.a;
                    Context context3 = context2;
                    PowerManager powerManager = (PowerManager) context3.getSystemService("power");
                    try {
                        bool = Boolean.valueOf(Settings.Global.getInt(context3.getContentResolver(), "animator_duration_scale") == 0 && Settings.Global.getInt(context3.getContentResolver(), "transition_animation_scale") == 0 && Settings.Global.getInt(context3.getContentResolver(), "window_animation_scale") == 0);
                    } catch (Throwable unused) {
                        bool = null;
                    }
                    Boolean valueOf = bool != null ? Boolean.valueOf(!bool.booleanValue()) : null;
                    try {
                        Method declaredMethod = powerManager.getClass().getDeclaredMethod("getMinimumScreenBrightnessSetting", null);
                        declaredMethod.setAccessible(true);
                        Object invoke2 = declaredMethod.invoke(powerManager, null);
                        if (!(invoke2 instanceof Integer)) {
                            invoke2 = null;
                        }
                        num = (Integer) invoke2;
                    } catch (Throwable unused2) {
                        num = null;
                    }
                    try {
                        Method declaredMethod2 = powerManager.getClass().getDeclaredMethod("getMaximumScreenBrightnessSetting", null);
                        declaredMethod2.setAccessible(true);
                        Object invoke3 = declaredMethod2.invoke(powerManager, null);
                        if (!(invoke3 instanceof Integer)) {
                            invoke3 = null;
                        }
                        num2 = (Integer) invoke3;
                    } catch (Throwable unused3) {
                        num2 = null;
                    }
                    try {
                        num3 = Integer.valueOf(Settings.System.getInt(context3.getContentResolver(), "screen_brightness"));
                    } catch (Throwable unused4) {
                        num3 = null;
                    }
                    if (num3 != null && num2 != null && num != null) {
                        try {
                            f = Float.valueOf((bn10.c(num3.intValue(), num.intValue(), num2.intValue()) - num.intValue()) / (num2.intValue() - num.intValue()));
                        } catch (Throwable unused5) {
                        }
                        int i = Settings.Secure.getInt(context3.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER);
                        for (DaltonizerData$Mode daltonizerData$Mode2 : DaltonizerData$Mode.values()) {
                            if (daltonizerData$Mode2.h() != i) {
                            }
                            break;
                        }
                        daltonizerData$Mode2 = null;
                        break;
                        Boolean bool5 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED) != 1);
                        Boolean bool6 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED) != 1);
                        int i2 = Settings.System.getInt(context3.getContentResolver(), "display_color_mode");
                        for (ColorModeData$Mode colorModeData$Mode2 : ColorModeData$Mode.values()) {
                            if (colorModeData$Mode2.h() != i2) {
                            }
                            break;
                        }
                        colorModeData$Mode2 = null;
                        break;
                        Boolean bool7 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "night_display_activated") != 1);
                        Boolean bool8 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "night_display_auto_mode") != 1);
                        Boolean bool9 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "display_white_balance_enabled") != 1);
                        Boolean bool10 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "reduce_bright_colors_activated") != 1);
                        Boolean bool11 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "ReduceBrightColors", false));
                        Boolean a = ytk.a(bool10, bool11);
                        int i3 = iah0.f().densityDpi;
                        num4 = Integer.valueOf(DisplayMetrics.DENSITY_DEVICE_STABLE);
                        if (num4 != null) {
                            try {
                                f2 = Float.valueOf(i3 / num4.intValue());
                            } catch (Throwable unused6) {
                            }
                            AccessibilityManager accessibilityManager = (AccessibilityManager) context3.getSystemService("accessibility");
                            Float f4 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "font_scale"));
                            f3 = (Float) ezi.a.a.get(ezi.a.a(context3));
                            if (f3 == null) {
                                f3 = f4;
                            }
                            om omVar4 = omVar3;
                            Boolean bool12 = null;
                            Method declaredMethod3 = accessibilityManager.getClass().getDeclaredMethod("isHighTextContrastEnabled", null);
                            declaredMethod3.setAccessible(true);
                            invoke = declaredMethod3.invoke(accessibilityManager, null);
                            if (invoke instanceof Boolean) {
                                bool2 = (Boolean) invoke;
                                Boolean bool13 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "master_mono") != 1);
                                Float f5 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "master_balance"));
                                colorModeData$Mode = colorModeData$Mode2;
                                Boolean bool14 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "hearing_aid") != 1);
                                daltonizerData$Mode = daltonizerData$Mode2;
                                Boolean bool15 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "odi_captions_enabled") == 1);
                                AccessibilityManager accessibilityManager2 = (AccessibilityManager) context3.getSystemService("accessibility");
                                Float f6 = f5;
                                Boolean bool16 = bool13;
                                Boolean bool17 = bool14;
                                Boolean bool18 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "MagnificationController", false));
                                Boolean bool19 = bool15;
                                Boolean bool20 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "MagnificationController", false));
                                Boolean bool21 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_enabled") != 1);
                                Boolean bool22 = bool2;
                                Boolean bool23 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_navbar_enabled") != 1);
                                Boolean a2 = ytk.a(bool18, bool20, bool21, bool23);
                                bool3 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1);
                                Boolean bool24 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "AccessibilityMenuService", false));
                                Boolean bool25 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "AccessibilityMenuService", false));
                                Boolean bool26 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "AccessibilityMenuService", false));
                                if (epx.f(bool3, Boolean.TRUE)) {
                                    bool3 = ytk.a(bool25, bool24, bool26);
                                }
                                Boolean bool27 = bool3;
                                Boolean bool28 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "one_handed_mode_enabled") == 1);
                                Boolean bool29 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "OneHandedMode", false));
                                Boolean a3 = ytk.a(bool28, bool29);
                                Boolean bool30 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_large_pointer_icon") == 1);
                                Boolean bool31 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") != 1 && drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "SelectToSpeakService", false));
                                if (Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1) {
                                    z = false;
                                    try {
                                    } catch (Throwable unused7) {
                                        bool4 = null;
                                        boolean isTouchExplorationEnabled = accessibilityManager2.isTouchExplorationEnabled();
                                        Boolean bool32 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "vibrate_when_ringing") == 1 ? true : z);
                                        Boolean bool33 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "haptic_feedback_enabled") == 1 ? true : z);
                                        if (Settings.System.getInt(context3.getContentResolver(), "notification_vibration_intensity") != 0) {
                                        }
                                        Boolean bool34 = Boolean.valueOf(z);
                                        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness = new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(num, num2, f);
                                        if (colorModeData$Mode != null) {
                                        }
                                        if (daltonizerData$Mode != null) {
                                        }
                                        return new MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness, f2, valueOf, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(bool6, bool7, bool8, colorMode, bool9, bool5, daltonizerMode, a)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(f3, f4, bool22), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(a2, bool31, bool4, bool30, bool27, Boolean.valueOf(isTouchExplorationEnabled), a3, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(bool32, bool34, bool33)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(bool16, f6, bool17, bool19));
                                    }
                                    if (drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "SwitchAccessService", false)) {
                                        z2 = true;
                                        bool4 = Boolean.valueOf(z2);
                                        boolean isTouchExplorationEnabled2 = accessibilityManager2.isTouchExplorationEnabled();
                                        Boolean bool322 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "vibrate_when_ringing") == 1 ? true : z);
                                        Boolean bool332 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "haptic_feedback_enabled") == 1 ? true : z);
                                        if (Settings.System.getInt(context3.getContentResolver(), "notification_vibration_intensity") != 0) {
                                            z = true;
                                        }
                                        Boolean bool342 = Boolean.valueOf(z);
                                        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness2 = new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(num, num2, f);
                                        if (colorModeData$Mode != null) {
                                            omVar4.getClass();
                                            int i4 = om.a.$EnumSwitchMapping$0[colorModeData$Mode.ordinal()];
                                            if (i4 == 1) {
                                                colorMode = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.ColorMode.NATURAL;
                                            } else if (i4 == 2) {
                                                colorMode = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.ColorMode.BOOSTED;
                                            } else if (i4 == 3) {
                                                colorMode = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.ColorMode.SATURATED;
                                            } else {
                                                if (i4 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                colorMode = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.ColorMode.AUTOMATIC;
                                            }
                                        } else {
                                            colorMode = null;
                                        }
                                        if (daltonizerData$Mode != null) {
                                            omVar4.getClass();
                                            int i5 = om.a.$EnumSwitchMapping$1[daltonizerData$Mode.ordinal()];
                                            if (i5 == 1) {
                                                daltonizerMode2 = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.DaltonizerMode.PROTANOMALY;
                                            } else if (i5 == 2) {
                                                daltonizerMode2 = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.DaltonizerMode.DEUTERANOMALY;
                                            } else {
                                                if (i5 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                daltonizerMode2 = MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.DaltonizerMode.TRITANOMALY;
                                            }
                                            daltonizerMode = daltonizerMode2;
                                        } else {
                                            daltonizerMode = null;
                                        }
                                        return new MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness2, f2, valueOf, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(bool6, bool7, bool8, colorMode, bool9, bool5, daltonizerMode, a)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(f3, f4, bool22), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(a2, bool31, bool4, bool30, bool27, Boolean.valueOf(isTouchExplorationEnabled2), a3, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(bool322, bool342, bool332)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(bool16, f6, bool17, bool19));
                                    }
                                } else {
                                    z = false;
                                }
                                z2 = z;
                                bool4 = Boolean.valueOf(z2);
                                boolean isTouchExplorationEnabled22 = accessibilityManager2.isTouchExplorationEnabled();
                                Boolean bool3222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "vibrate_when_ringing") == 1 ? true : z);
                                Boolean bool3322 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "haptic_feedback_enabled") == 1 ? true : z);
                                if (Settings.System.getInt(context3.getContentResolver(), "notification_vibration_intensity") != 0) {
                                }
                                Boolean bool3422 = Boolean.valueOf(z);
                                MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness22 = new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(num, num2, f);
                                if (colorModeData$Mode != null) {
                                }
                                if (daltonizerData$Mode != null) {
                                }
                                return new MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness22, f2, valueOf, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(bool6, bool7, bool8, colorMode, bool9, bool5, daltonizerMode, a)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(f3, f4, bool22), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(a2, bool31, bool4, bool30, bool27, Boolean.valueOf(isTouchExplorationEnabled22), a3, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(bool3222, bool3422, bool3322)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(bool16, f6, bool17, bool19));
                            }
                            bool2 = bool12;
                            Boolean bool132 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "master_mono") != 1);
                            Float f52 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "master_balance"));
                            colorModeData$Mode = colorModeData$Mode2;
                            Boolean bool142 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "hearing_aid") != 1);
                            daltonizerData$Mode = daltonizerData$Mode2;
                            Boolean bool152 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "odi_captions_enabled") == 1);
                            AccessibilityManager accessibilityManager22 = (AccessibilityManager) context3.getSystemService("accessibility");
                            Float f62 = f52;
                            Boolean bool162 = bool132;
                            Boolean bool172 = bool142;
                            Boolean bool182 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "MagnificationController", false));
                            Boolean bool192 = bool152;
                            Boolean bool202 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "MagnificationController", false));
                            Boolean bool212 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_enabled") != 1);
                            Boolean bool222 = bool2;
                            Boolean bool232 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_navbar_enabled") != 1);
                            Boolean a22 = ytk.a(bool182, bool202, bool212, bool232);
                            bool3 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1);
                            Boolean bool242 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "AccessibilityMenuService", false));
                            Boolean bool252 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "AccessibilityMenuService", false));
                            Boolean bool262 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "AccessibilityMenuService", false));
                            if (epx.f(bool3, Boolean.TRUE)) {
                            }
                            Boolean bool272 = bool3;
                            Boolean bool282 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "one_handed_mode_enabled") == 1);
                            Boolean bool292 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "OneHandedMode", false));
                            Boolean a32 = ytk.a(bool282, bool292);
                            Boolean bool302 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_large_pointer_icon") == 1);
                            Boolean bool312 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") != 1 && drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "SelectToSpeakService", false));
                            if (Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1) {
                            }
                            z2 = z;
                            bool4 = Boolean.valueOf(z2);
                            boolean isTouchExplorationEnabled222 = accessibilityManager22.isTouchExplorationEnabled();
                            Boolean bool32222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "vibrate_when_ringing") == 1 ? true : z);
                            Boolean bool33222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "haptic_feedback_enabled") == 1 ? true : z);
                            if (Settings.System.getInt(context3.getContentResolver(), "notification_vibration_intensity") != 0) {
                            }
                            Boolean bool34222 = Boolean.valueOf(z);
                            MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness222 = new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(num, num2, f);
                            if (colorModeData$Mode != null) {
                            }
                            if (daltonizerData$Mode != null) {
                            }
                            return new MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness222, f2, valueOf, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(bool6, bool7, bool8, colorMode, bool9, bool5, daltonizerMode, a)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(f3, f4, bool222), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(a22, bool312, bool4, bool302, bool272, Boolean.valueOf(isTouchExplorationEnabled222), a32, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(bool32222, bool34222, bool33222)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(bool162, f62, bool172, bool192));
                        }
                        f2 = null;
                        AccessibilityManager accessibilityManager3 = (AccessibilityManager) context3.getSystemService("accessibility");
                        Float f42 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "font_scale"));
                        f3 = (Float) ezi.a.a.get(ezi.a.a(context3));
                        if (f3 == null) {
                        }
                        om omVar42 = omVar3;
                        Boolean bool122 = null;
                        Method declaredMethod32 = accessibilityManager3.getClass().getDeclaredMethod("isHighTextContrastEnabled", null);
                        declaredMethod32.setAccessible(true);
                        invoke = declaredMethod32.invoke(accessibilityManager3, null);
                        if (invoke instanceof Boolean) {
                        }
                        bool2 = bool122;
                        Boolean bool1322 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "master_mono") != 1);
                        Float f522 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "master_balance"));
                        colorModeData$Mode = colorModeData$Mode2;
                        Boolean bool1422 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "hearing_aid") != 1);
                        daltonizerData$Mode = daltonizerData$Mode2;
                        Boolean bool1522 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "odi_captions_enabled") == 1);
                        AccessibilityManager accessibilityManager222 = (AccessibilityManager) context3.getSystemService("accessibility");
                        Float f622 = f522;
                        Boolean bool1622 = bool1322;
                        Boolean bool1722 = bool1422;
                        Boolean bool1822 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "MagnificationController", false));
                        Boolean bool1922 = bool1522;
                        Boolean bool2022 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "MagnificationController", false));
                        Boolean bool2122 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_enabled") != 1);
                        Boolean bool2222 = bool2;
                        Boolean bool2322 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_navbar_enabled") != 1);
                        Boolean a222 = ytk.a(bool1822, bool2022, bool2122, bool2322);
                        bool3 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1);
                        Boolean bool2422 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "AccessibilityMenuService", false));
                        Boolean bool2522 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "AccessibilityMenuService", false));
                        Boolean bool2622 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "AccessibilityMenuService", false));
                        if (epx.f(bool3, Boolean.TRUE)) {
                        }
                        Boolean bool2722 = bool3;
                        Boolean bool2822 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "one_handed_mode_enabled") == 1);
                        Boolean bool2922 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "OneHandedMode", false));
                        Boolean a322 = ytk.a(bool2822, bool2922);
                        Boolean bool3022 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_large_pointer_icon") == 1);
                        Boolean bool3122 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") != 1 && drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "SelectToSpeakService", false));
                        if (Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1) {
                        }
                        z2 = z;
                        bool4 = Boolean.valueOf(z2);
                        boolean isTouchExplorationEnabled2222 = accessibilityManager222.isTouchExplorationEnabled();
                        Boolean bool322222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "vibrate_when_ringing") == 1 ? true : z);
                        Boolean bool332222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "haptic_feedback_enabled") == 1 ? true : z);
                        if (Settings.System.getInt(context3.getContentResolver(), "notification_vibration_intensity") != 0) {
                        }
                        Boolean bool342222 = Boolean.valueOf(z);
                        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness2222 = new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(num, num2, f);
                        if (colorModeData$Mode != null) {
                        }
                        if (daltonizerData$Mode != null) {
                        }
                        return new MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness2222, f2, valueOf, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(bool6, bool7, bool8, colorMode, bool9, bool5, daltonizerMode, a)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(f3, f42, bool2222), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(a222, bool3122, bool4, bool3022, bool2722, Boolean.valueOf(isTouchExplorationEnabled2222), a322, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(bool322222, bool342222, bool332222)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(bool1622, f622, bool1722, bool1922));
                    }
                    f = null;
                    int i6 = Settings.Secure.getInt(context3.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER);
                    while (r14 < r13) {
                    }
                    daltonizerData$Mode2 = null;
                    break;
                    Boolean bool52 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED) != 1);
                    Boolean bool62 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED) != 1);
                    int i22 = Settings.System.getInt(context3.getContentResolver(), "display_color_mode");
                    while (r13 < r12) {
                    }
                    colorModeData$Mode2 = null;
                    break;
                    Boolean bool72 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "night_display_activated") != 1);
                    Boolean bool82 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "night_display_auto_mode") != 1);
                    Boolean bool92 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "display_white_balance_enabled") != 1);
                    Boolean bool102 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "reduce_bright_colors_activated") != 1);
                    Boolean bool112 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "ReduceBrightColors", false));
                    Boolean a4 = ytk.a(bool102, bool112);
                    int i32 = iah0.f().densityDpi;
                    num4 = Integer.valueOf(DisplayMetrics.DENSITY_DEVICE_STABLE);
                    if (num4 != null) {
                    }
                    f2 = null;
                    AccessibilityManager accessibilityManager32 = (AccessibilityManager) context3.getSystemService("accessibility");
                    Float f422 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "font_scale"));
                    f3 = (Float) ezi.a.a.get(ezi.a.a(context3));
                    if (f3 == null) {
                    }
                    om omVar422 = omVar3;
                    Boolean bool1222 = null;
                    Method declaredMethod322 = accessibilityManager32.getClass().getDeclaredMethod("isHighTextContrastEnabled", null);
                    declaredMethod322.setAccessible(true);
                    invoke = declaredMethod322.invoke(accessibilityManager32, null);
                    if (invoke instanceof Boolean) {
                    }
                    bool2 = bool1222;
                    Boolean bool13222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "master_mono") != 1);
                    Float f5222 = Float.valueOf(Settings.System.getFloat(context3.getContentResolver(), "master_balance"));
                    colorModeData$Mode = colorModeData$Mode2;
                    Boolean bool14222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "hearing_aid") != 1);
                    daltonizerData$Mode = daltonizerData$Mode2;
                    Boolean bool15222 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "odi_captions_enabled") == 1);
                    AccessibilityManager accessibilityManager2222 = (AccessibilityManager) context3.getSystemService("accessibility");
                    Float f6222 = f5222;
                    Boolean bool16222 = bool13222;
                    Boolean bool17222 = bool14222;
                    Boolean bool18222 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "MagnificationController", false));
                    Boolean bool19222 = bool15222;
                    Boolean bool20222 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "MagnificationController", false));
                    Boolean bool21222 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_enabled") != 1);
                    Boolean bool22222 = bool2;
                    Boolean bool23222 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_display_magnification_navbar_enabled") != 1);
                    Boolean a2222 = ytk.a(bool18222, bool20222, bool21222, bool23222);
                    bool3 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1);
                    Boolean bool24222 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "AccessibilityMenuService", false));
                    Boolean bool25222 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "AccessibilityMenuService", false));
                    Boolean bool26222 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_shortcut_target_service"), "AccessibilityMenuService", false));
                    if (epx.f(bool3, Boolean.TRUE)) {
                    }
                    Boolean bool27222 = bool3;
                    Boolean bool28222 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "one_handed_mode_enabled") == 1);
                    Boolean bool29222 = Boolean.valueOf(drm0.D(Settings.Secure.getString(context3.getContentResolver(), "accessibility_button_targets"), "OneHandedMode", false));
                    Boolean a3222 = ytk.a(bool28222, bool29222);
                    Boolean bool30222 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_large_pointer_icon") == 1);
                    Boolean bool31222 = Boolean.valueOf(Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") != 1 && drm0.D(Settings.Secure.getString(context3.getContentResolver(), "enabled_accessibility_services"), "SelectToSpeakService", false));
                    if (Settings.Secure.getInt(context3.getContentResolver(), "accessibility_enabled") == 1) {
                    }
                    z2 = z;
                    bool4 = Boolean.valueOf(z2);
                    boolean isTouchExplorationEnabled22222 = accessibilityManager2222.isTouchExplorationEnabled();
                    Boolean bool3222222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "vibrate_when_ringing") == 1 ? true : z);
                    Boolean bool3322222 = Boolean.valueOf(Settings.System.getInt(context3.getContentResolver(), "haptic_feedback_enabled") == 1 ? true : z);
                    if (Settings.System.getInt(context3.getContentResolver(), "notification_vibration_intensity") != 0) {
                    }
                    Boolean bool3422222 = Boolean.valueOf(z);
                    MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness22222 = new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(num, num2, f);
                    if (colorModeData$Mode != null) {
                    }
                    if (daltonizerData$Mode != null) {
                    }
                    return new MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness22222, f2, valueOf, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(bool62, bool72, bool82, colorMode, bool92, bool52, daltonizerMode, a4)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(f3, f422, bool22222), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(a2222, bool31222, bool4, bool30222, bool27222, Boolean.valueOf(isTouchExplorationEnabled22222), a3222, new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(bool3222222, bool3422222, bool3322222)), new MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(bool16222, f6222, bool17222, bool19222));
                }
            });
        }
    }

    static {
        om omVar = new om();
        a = omVar;
        io.reactivex.rxjava3.subjects.d<Context> N0 = io.reactivex.rxjava3.subjects.d.N0();
        io.reactivex.rxjava3.internal.operators.observable.s2 u0 = N0.u0(1L, TimeUnit.SECONDS);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(u0.a0(asu0Var.c()), new jm(new im(0))), new km(new b(1, omVar, om.class, "makeStatEvent", "makeStatEvent(Landroid/content/Context;)Lio/reactivex/rxjava3/core/Single;", 0))).r0(asu0Var.c());
        mm mmVar = new mm(new lm(0), 0);
        int i = kwg0.a;
        r0.subscribe(mmVar, new hwg0());
        b = N0;
    }
}
