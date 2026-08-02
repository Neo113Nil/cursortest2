package com.yandex.div.evaluable.function;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.air;
import xsna.epx;

/* compiled from: GeneratedBuiltinFunctionProvider.kt */
/* loaded from: classes7.dex */
public final class GeneratedBuiltinFunctionProvider implements FunctionProvider {
    public static final GeneratedBuiltinFunctionProvider INSTANCE = new GeneratedBuiltinFunctionProvider();

    private GeneratedBuiltinFunctionProvider() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function get(String str, List<? extends EvaluableType> list) {
        switch (str.hashCode()) {
            case -2129095909:
                if (str.equals("getArrayInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayInteger.INSTANCE, list);
                }
                break;
            case -2096254100:
                if (str.equals("getArrayFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayFromArray.INSTANCE, list);
                }
                break;
            case -2015731347:
                if (str.equals("formatDateAsUTCWithLocale")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsUTCWithLocale.INSTANCE, list);
                }
                break;
            case -1930505522:
                if (str.equals("getOptIntegerFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptIntegerFromArray.INSTANCE, list);
                }
                break;
            case -1919300188:
                if (str.equals("toNumber")) {
                    IntegerToNumber integerToNumber = IntegerToNumber.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable = integerToNumber.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable, ok)) {
                        StringToNumber stringToNumber = StringToNumber.INSTANCE;
                        if (!epx.f(stringToNumber.matchesArguments$div_evaluable(list), ok)) {
                            if (!epx.f(integerToNumber.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                if (!epx.f(stringToNumber.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return stringToNumber;
                    }
                    return integerToNumber;
                }
                break;
            case -1857218874:
                if (str.equals("getIntervalTotalHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalHours.INSTANCE, list);
                }
                break;
            case -1843679562:
                if (str.equals("getIntervalTotalWeeks")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalWeeks.INSTANCE, list);
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    ArrayToString arrayToString = ArrayToString.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable2 = arrayToString.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok2 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable2, ok2)) {
                        BooleanToString booleanToString = BooleanToString.INSTANCE;
                        if (!epx.f(booleanToString.matchesArguments$div_evaluable(list), ok2)) {
                            ColorToString colorToString = ColorToString.INSTANCE;
                            if (!epx.f(colorToString.matchesArguments$div_evaluable(list), ok2)) {
                                DictToString dictToString = DictToString.INSTANCE;
                                if (!epx.f(dictToString.matchesArguments$div_evaluable(list), ok2)) {
                                    IntegerToString integerToString = IntegerToString.INSTANCE;
                                    if (!epx.f(integerToString.matchesArguments$div_evaluable(list), ok2)) {
                                        NumberToString numberToString = NumberToString.INSTANCE;
                                        if (!epx.f(numberToString.matchesArguments$div_evaluable(list), ok2)) {
                                            StringToString stringToString = StringToString.INSTANCE;
                                            if (!epx.f(stringToString.matchesArguments$div_evaluable(list), ok2)) {
                                                UrlToString urlToString = UrlToString.INSTANCE;
                                                if (!epx.f(urlToString.matchesArguments$div_evaluable(list), ok2)) {
                                                    if (!epx.f(arrayToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                        if (!epx.f(booleanToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                            if (!epx.f(colorToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                                if (!epx.f(dictToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                                    if (!epx.f(integerToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                                        if (!epx.f(numberToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                                            if (!epx.f(stringToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                                                if (!epx.f(urlToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                                                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return urlToString;
                                            }
                                            return stringToString;
                                        }
                                        return numberToString;
                                    }
                                    return integerToString;
                                }
                                return dictToString;
                            }
                            return colorToString;
                        }
                        return booleanToString;
                    }
                    return arrayToString;
                }
                break;
            case -1730341801:
                if (str.equals("getDictOptInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptInteger.INSTANCE, list);
                }
                break;
            case -1603949422:
                if (str.equals("getBooleanFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanFromDict.INSTANCE, list);
                }
                break;
            case -1601021533:
                if (str.equals("getDictUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictUrl.INSTANCE, list);
                }
                break;
            case -1598503635:
                if (str.equals("toBoolean")) {
                    IntegerToBoolean integerToBoolean = IntegerToBoolean.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable3 = integerToBoolean.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok3 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable3, ok3)) {
                        StringToBoolean stringToBoolean = StringToBoolean.INSTANCE;
                        if (!epx.f(stringToBoolean.matchesArguments$div_evaluable(list), ok3)) {
                            if (!epx.f(integerToBoolean.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                                if (!epx.f(stringToBoolean.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return stringToBoolean;
                    }
                    return integerToBoolean;
                }
                break;
            case -1586214751:
                if (str.equals("getOptIntegerFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptIntegerFromDict.INSTANCE, list);
                }
                break;
            case -1544450268:
                if (str.equals("getOptBooleanFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptBooleanFromArray.INSTANCE, list);
                }
                break;
            case -1536224128:
                if (str.equals("getArrayColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayColor.INSTANCE, list);
                }
                break;
            case -1506310026:
                if (str.equals("getIntervalTotalSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalSeconds.INSTANCE, list);
                }
                break;
            case -1436100668:
                if (str.equals("getIntervalSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalSeconds.INSTANCE, list);
                }
                break;
            case -1288010167:
                if (str.equals("getSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetSeconds.INSTANCE, list);
                }
                break;
            case -1249364890:
                if (str.equals("getDay")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDay.INSTANCE, list);
                }
                break;
            case -1233067443:
                if (str.equals("replaceAll")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringReplaceAll.INSTANCE, list);
                }
                break;
            case -1223509624:
                if (str.equals("getStringFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringFromArray.INSTANCE, list);
                }
                break;
            case -1192573227:
                if (str.equals("testRegex")) {
                    return FunctionValidatorKt.withArgumentsValidation(TestRegex.INSTANCE, list);
                }
                break;
            case -1180629592:
                if (str.equals("toColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringToColor.INSTANCE, list);
                }
                break;
            case -1168421440:
                if (str.equals("getIntervalTotalDays")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalDays.INSTANCE, list);
                }
                break;
            case -1162978502:
                if (str.equals("maxInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(IntegerMaxValue.INSTANCE, list);
                }
                break;
            case -1148047119:
                if (str.equals("parseUnixTimeAsLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(ParseUnixTimeAsLocal.INSTANCE, list);
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    return FunctionValidatorKt.withArgumentsValidation(ToLowerCase.INSTANCE, list);
                }
                break;
            case -1133026611:
                if (str.equals("formatDateAsUTC")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsUTC.INSTANCE, list);
                }
                break;
            case -1131397482:
                if (str.equals("getUrlFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetUrlFromArray.INSTANCE, list);
                }
                break;
            case -1077888264:
                if (str.equals("getArrayOptBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptBoolean.INSTANCE, list);
                }
                break;
            case -1072121784:
                if (str.equals("parseUnixTime")) {
                    return FunctionValidatorKt.withArgumentsValidation(ParseUnixTime.INSTANCE, list);
                }
                break;
            case -1071222151:
                if (str.equals("getArrayOptNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptNumber.INSTANCE, list);
                }
                break;
            case -1013579358:
                if (str.equals("getColorFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetColorFromArray.INSTANCE, list);
                }
                break;
            case -1000110441:
                if (str.equals("getDictColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictColor.INSTANCE, list);
                }
                break;
            case -995871928:
                if (str.equals("padEnd")) {
                    PadEndInteger padEndInteger = PadEndInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable4 = padEndInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok4 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable4, ok4)) {
                        PadEndString padEndString = PadEndString.INSTANCE;
                        if (!epx.f(padEndString.matchesArguments$div_evaluable(list), ok4)) {
                            if (!epx.f(padEndInteger.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                                if (!epx.f(padEndString.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return padEndString;
                    }
                    return padEndInteger;
                }
                break;
            case -962804868:
                if (str.equals("getOptArrayFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptArrayFromDict.INSTANCE, list);
                }
                break;
            case -928843967:
                if (str.equals("getArrayOptString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptString.INSTANCE, list);
                }
                break;
            case -905815078:
                if (str.equals("setDay")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetDay.INSTANCE, list);
                }
                break;
            case -902467307:
                if (str.equals("signum")) {
                    DoubleSignum doubleSignum = DoubleSignum.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable5 = doubleSignum.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok5 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable5, ok5)) {
                        IntegerSignum integerSignum = IntegerSignum.INSTANCE;
                        if (!epx.f(integerSignum.matchesArguments$div_evaluable(list), ok5)) {
                            if (!epx.f(doubleSignum.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                                if (!epx.f(integerSignum.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerSignum;
                    }
                    return doubleSignum;
                }
                break;
            case -863899827:
                if (str.equals("getColorFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetColorFromDict.INSTANCE, list);
                }
                break;
            case -823914681:
                if (str.equals("getStoredColorValue")) {
                    GetStoredColorValue getStoredColorValue = GetStoredColorValue.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable6 = getStoredColorValue.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok6 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable6, ok6)) {
                        GetStoredColorValueString getStoredColorValueString = GetStoredColorValueString.INSTANCE;
                        if (!epx.f(getStoredColorValueString.matchesArguments$div_evaluable(list), ok6)) {
                            if (!epx.f(getStoredColorValue.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                                if (!epx.f(getStoredColorValueString.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getStoredColorValueString;
                    }
                    return getStoredColorValue;
                }
                break;
            case -792903165:
                if (str.equals("getDictFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictFromArray.INSTANCE, list);
                }
                break;
            case -775185381:
                if (str.equals("setColorBlue")) {
                    ColorBlueComponentSetter colorBlueComponentSetter = ColorBlueComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable7 = colorBlueComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok7 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable7, ok7)) {
                        ColorStringBlueComponentSetter colorStringBlueComponentSetter = ColorStringBlueComponentSetter.INSTANCE;
                        if (!epx.f(colorStringBlueComponentSetter.matchesArguments$div_evaluable(list), ok7)) {
                            if (!epx.f(colorBlueComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                                if (!epx.f(colorStringBlueComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringBlueComponentSetter;
                    }
                    return colorBlueComponentSetter;
                }
                break;
            case -757068958:
                if (str.equals("getStoredBooleanValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredBooleanValue.INSTANCE, list);
                }
                break;
            case -740156815:
                if (str.equals("getDayOfWeek")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDayOfWeek.INSTANCE, list);
                }
                break;
            case -719400499:
                if (str.equals("maxNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleMaxValue.INSTANCE, list);
                }
                break;
            case -718233908:
                if (str.equals("getDictFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictFromDict.INSTANCE, list);
                }
                break;
            case -711609332:
                if (str.equals("getStoredIntegerValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredIntegerValue.INSTANCE, list);
                }
                break;
            case -694406281:
                if (str.equals("toRadians")) {
                    return FunctionValidatorKt.withArgumentsValidation(DegreesToRadians.INSTANCE, list);
                }
                break;
            case -637295986:
                if (str.equals("getOptStringFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptStringFromDict.INSTANCE, list);
                }
                break;
            case -625627966:
                if (str.equals("getStoredDictValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredDictValue.INSTANCE, list);
                }
                break;
            case -618173803:
                if (str.equals("getDictNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictNumber.INSTANCE, list);
                }
                break;
            case -593965816:
                if (str.equals("getDictOptUrl")) {
                    GetDictOptUrlWithStringFallback getDictOptUrlWithStringFallback = GetDictOptUrlWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable8 = getDictOptUrlWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok8 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable8, ok8)) {
                        GetDictOptUrlWithUrlFallback getDictOptUrlWithUrlFallback = GetDictOptUrlWithUrlFallback.INSTANCE;
                        if (!epx.f(getDictOptUrlWithUrlFallback.matchesArguments$div_evaluable(list), ok8)) {
                            if (!epx.f(getDictOptUrlWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                                if (!epx.f(getDictOptUrlWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getDictOptUrlWithUrlFallback;
                    }
                    return getDictOptUrlWithStringFallback;
                }
                break;
            case -567445985:
                if (str.equals("contains")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringContains.INSTANCE, list);
                }
                break;
            case -505987374:
                if (str.equals("copySign")) {
                    DoubleCopySign doubleCopySign = DoubleCopySign.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable9 = doubleCopySign.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok9 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable9, ok9)) {
                        IntegerCopySign integerCopySign = IntegerCopySign.INSTANCE;
                        if (!epx.f(integerCopySign.matchesArguments$div_evaluable(list), ok9)) {
                            if (!epx.f(doubleCopySign.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                                if (!epx.f(integerCopySign.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerCopySign;
                    }
                    return doubleCopySign;
                }
                break;
            case -496262374:
                if (str.equals("trimRight")) {
                    return FunctionValidatorKt.withArgumentsValidation(TrimRight.INSTANCE, list);
                }
                break;
            case -475795619:
                if (str.equals("getDictString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictString.INSTANCE, list);
                }
                break;
            case -407622546:
                if (str.equals("getDictValues")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictValues.INSTANCE, list);
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    return FunctionValidatorKt.withArgumentsValidation(ToUpperCase.INSTANCE, list);
                }
                break;
            case -342730167:
                if (str.equals("getOptNumberFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptNumberFromArray.INSTANCE, list);
                }
                break;
            case -288070202:
                if (str.equals("getOptNumberFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptNumberFromDict.INSTANCE, list);
                }
                break;
            case -256399843:
                if (str.equals("setMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMinutes.INSTANCE, list);
                }
                break;
            case -230929496:
                if (str.equals("getIntegerFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerFromDict.INSTANCE, list);
                }
                break;
            case -181255609:
                if (str.equals("addMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(AddMillis.INSTANCE, list);
                }
                break;
            case -174963751:
                if (str.equals("getUrlFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetUrlFromDict.INSTANCE, list);
                }
                break;
            case -116997076:
                if (str.equals("toDegrees")) {
                    return FunctionValidatorKt.withArgumentsValidation(RadiansToDegrees.INSTANCE, list);
                }
                break;
            case -92937393:
                if (str.equals("getStoredNumberValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredNumberValue.INSTANCE, list);
                }
                break;
            case -74977101:
                if (str.equals("getYear")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetYear.INSTANCE, list);
                }
                break;
            case -57828916:
                if (str.equals("getArrayNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayNumber.INSTANCE, list);
                }
                break;
            case -33620929:
                if (str.equals("getArrayOptUrl")) {
                    GetArrayOptUrlWithStringFallback getArrayOptUrlWithStringFallback = GetArrayOptUrlWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable10 = getArrayOptUrlWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok10 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable10, ok10)) {
                        GetArrayOptUrlWithUrlFallback getArrayOptUrlWithUrlFallback = GetArrayOptUrlWithUrlFallback.INSTANCE;
                        if (!epx.f(getArrayOptUrlWithUrlFallback.matchesArguments$div_evaluable(list), ok10)) {
                            if (!epx.f(getArrayOptUrlWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                                if (!epx.f(getArrayOptUrlWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getArrayOptUrlWithUrlFallback;
                    }
                    return getArrayOptUrlWithStringFallback;
                }
                break;
            case 3577:
                if (str.equals("pi")) {
                    return FunctionValidatorKt.withArgumentsValidation(Pi.INSTANCE, list);
                }
                break;
            case 96370:
                if (str.equals("abs")) {
                    DoubleAbs doubleAbs = DoubleAbs.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable11 = doubleAbs.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok11 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable11, ok11)) {
                        IntegerAbs integerAbs = IntegerAbs.INSTANCE;
                        if (!epx.f(integerAbs.matchesArguments$div_evaluable(list), ok11)) {
                            if (!epx.f(doubleAbs.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                                if (!epx.f(integerAbs.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerAbs;
                    }
                    return doubleAbs;
                }
                break;
            case 98695:
                if (str.equals("cos")) {
                    return FunctionValidatorKt.withArgumentsValidation(Cos.INSTANCE, list);
                }
                break;
            case 98696:
                if (str.equals("cot")) {
                    return FunctionValidatorKt.withArgumentsValidation(Cot.INSTANCE, list);
                }
                break;
            case 99473:
                if (str.equals(TtmlNode.TAG_DIV)) {
                    DoubleDiv doubleDiv = DoubleDiv.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable12 = doubleDiv.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok12 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable12, ok12)) {
                        IntegerDiv integerDiv = IntegerDiv.INSTANCE;
                        if (!epx.f(integerDiv.matchesArguments$div_evaluable(list), ok12)) {
                            if (!epx.f(doubleDiv.matchesArgumentsWithCast$div_evaluable(list), ok12)) {
                                if (!epx.f(integerDiv.matchesArgumentsWithCast$div_evaluable(list), ok12)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerDiv;
                    }
                    return doubleDiv;
                }
                break;
            case 107029:
                if (str.equals("len")) {
                    GetArrayLength getArrayLength = GetArrayLength.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable13 = getArrayLength.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok13 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable13, ok13)) {
                        GetDictLength getDictLength = GetDictLength.INSTANCE;
                        if (!epx.f(getDictLength.matchesArguments$div_evaluable(list), ok13)) {
                            StringLength stringLength = StringLength.INSTANCE;
                            if (!epx.f(stringLength.matchesArguments$div_evaluable(list), ok13)) {
                                if (!epx.f(getArrayLength.matchesArgumentsWithCast$div_evaluable(list), ok13)) {
                                    if (!epx.f(getDictLength.matchesArgumentsWithCast$div_evaluable(list), ok13)) {
                                        if (!epx.f(stringLength.matchesArgumentsWithCast$div_evaluable(list), ok13)) {
                                            throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                        }
                                    }
                                }
                            }
                            return stringLength;
                        }
                        return getDictLength;
                    }
                    return getArrayLength;
                }
                break;
            case 107876:
                if (str.equals(InneractiveMediationNameConsts.MAX)) {
                    DoubleMax doubleMax = DoubleMax.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable14 = doubleMax.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok14 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable14, ok14)) {
                        IntegerMax integerMax = IntegerMax.INSTANCE;
                        if (!epx.f(integerMax.matchesArguments$div_evaluable(list), ok14)) {
                            if (!epx.f(doubleMax.matchesArgumentsWithCast$div_evaluable(list), ok14)) {
                                if (!epx.f(integerMax.matchesArgumentsWithCast$div_evaluable(list), ok14)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerMax;
                    }
                    return doubleMax;
                }
                break;
            case 108114:
                if (str.equals(UcumUtils.UCUM_MINUTES)) {
                    DoubleMin doubleMin = DoubleMin.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable15 = doubleMin.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok15 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable15, ok15)) {
                        IntegerMin integerMin = IntegerMin.INSTANCE;
                        if (!epx.f(integerMin.matchesArguments$div_evaluable(list), ok15)) {
                            if (!epx.f(doubleMin.matchesArgumentsWithCast$div_evaluable(list), ok15)) {
                                if (!epx.f(integerMin.matchesArgumentsWithCast$div_evaluable(list), ok15)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerMin;
                    }
                    return doubleMin;
                }
                break;
            case 108290:
                if (str.equals("mod")) {
                    DoubleMod doubleMod = DoubleMod.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable16 = doubleMod.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok16 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable16, ok16)) {
                        IntegerMod integerMod = IntegerMod.INSTANCE;
                        if (!epx.f(integerMod.matchesArguments$div_evaluable(list), ok16)) {
                            if (!epx.f(doubleMod.matchesArgumentsWithCast$div_evaluable(list), ok16)) {
                                if (!epx.f(integerMod.matchesArgumentsWithCast$div_evaluable(list), ok16)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerMod;
                    }
                    return doubleMod;
                }
                break;
            case 108484:
                if (str.equals("mul")) {
                    DoubleMul doubleMul = DoubleMul.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable17 = doubleMul.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok17 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable17, ok17)) {
                        IntegerMul integerMul = IntegerMul.INSTANCE;
                        if (!epx.f(integerMul.matchesArguments$div_evaluable(list), ok17)) {
                            if (!epx.f(doubleMul.matchesArgumentsWithCast$div_evaluable(list), ok17)) {
                                if (!epx.f(integerMul.matchesArgumentsWithCast$div_evaluable(list), ok17)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerMul;
                    }
                    return doubleMul;
                }
                break;
            case 112845:
                if (str.equals("rgb")) {
                    return FunctionValidatorKt.withArgumentsValidation(ColorRgb.INSTANCE, list);
                }
                break;
            case 113880:
                if (str.equals("sin")) {
                    return FunctionValidatorKt.withArgumentsValidation(Sine.INSTANCE, list);
                }
                break;
            case 114240:
                if (str.equals(Claims.SUBJECT)) {
                    DoubleSub doubleSub = DoubleSub.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable18 = doubleSub.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok18 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable18, ok18)) {
                        IntegerSub integerSub = IntegerSub.INSTANCE;
                        if (!epx.f(integerSub.matchesArguments$div_evaluable(list), ok18)) {
                            if (!epx.f(doubleSub.matchesArgumentsWithCast$div_evaluable(list), ok18)) {
                                if (!epx.f(integerSub.matchesArgumentsWithCast$div_evaluable(list), ok18)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerSub;
                    }
                    return doubleSub;
                }
                break;
            case 114251:
                if (str.equals("sum")) {
                    DoubleSum doubleSum = DoubleSum.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable19 = doubleSum.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok19 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable19, ok19)) {
                        IntegerSum integerSum = IntegerSum.INSTANCE;
                        if (!epx.f(integerSum.matchesArguments$div_evaluable(list), ok19)) {
                            if (!epx.f(doubleSum.matchesArgumentsWithCast$div_evaluable(list), ok19)) {
                                if (!epx.f(integerSum.matchesArgumentsWithCast$div_evaluable(list), ok19)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return integerSum;
                    }
                    return doubleSum;
                }
                break;
            case 114593:
                if (str.equals("tan")) {
                    return FunctionValidatorKt.withArgumentsValidation(Tan.INSTANCE, list);
                }
                break;
            case 2988422:
                if (str.equals("acos")) {
                    return FunctionValidatorKt.withArgumentsValidation(Acos.INSTANCE, list);
                }
                break;
            case 3002572:
                if (str.equals("argb")) {
                    return FunctionValidatorKt.withArgumentsValidation(ColorArgb.INSTANCE, list);
                }
                break;
            case 3003607:
                if (str.equals("asin")) {
                    return FunctionValidatorKt.withArgumentsValidation(Asin.INSTANCE, list);
                }
                break;
            case 3004320:
                if (str.equals("atan")) {
                    return FunctionValidatorKt.withArgumentsValidation(Atan.INSTANCE, list);
                }
                break;
            case 3049733:
                if (str.equals("ceil")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleCeil.INSTANCE, list);
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    return FunctionValidatorKt.withArgumentsValidation(Trim.INSTANCE, list);
                }
                break;
            case 53078075:
                if (str.equals("minNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleMinValue.INSTANCE, list);
                }
                break;
            case 81708636:
                if (str.equals("getDictBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictBoolean.INSTANCE, list);
                }
                break;
            case 84549268:
                if (str.equals("getArrayString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayString.INSTANCE, list);
                }
                break;
            case 88715890:
                if (str.equals("getNumberValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberValue.INSTANCE, list);
                }
                break;
            case 93133970:
                if (str.equals("atan2")) {
                    return FunctionValidatorKt.withArgumentsValidation(Atan2.INSTANCE, list);
                }
                break;
            case 97526796:
                if (str.equals("floor")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleFloor.INSTANCE, list);
                }
                break;
            case 100346066:
                if (str.equals("index")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringIndex.INSTANCE, list);
                }
                break;
            case 108704142:
                if (str.equals("round")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleRound.INSTANCE, list);
                }
                break;
            case 110520564:
                if (str.equals("toUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringToUrl.INSTANCE, list);
                }
                break;
            case 181165108:
                if (str.equals("formatDateAsLocalWithLocale")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsLocalWithLocale.INSTANCE, list);
                }
                break;
            case 215331667:
                if (str.equals("getOptArrayFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptArrayFromArray.INSTANCE, list);
                }
                break;
            case 232128784:
                if (str.equals("getDictOptNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptNumber.INSTANCE, list);
                }
                break;
            case 272530949:
                if (str.equals("getArrayBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayBoolean.INSTANCE, list);
                }
                break;
            case 294836803:
                if (str.equals("toInteger")) {
                    BooleanToInteger booleanToInteger = BooleanToInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable20 = booleanToInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok20 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable20, ok20)) {
                        NumberToInteger numberToInteger = NumberToInteger.INSTANCE;
                        if (!epx.f(numberToInteger.matchesArguments$div_evaluable(list), ok20)) {
                            StringToInteger stringToInteger = StringToInteger.INSTANCE;
                            if (!epx.f(stringToInteger.matchesArguments$div_evaluable(list), ok20)) {
                                if (!epx.f(booleanToInteger.matchesArgumentsWithCast$div_evaluable(list), ok20)) {
                                    if (!epx.f(numberToInteger.matchesArgumentsWithCast$div_evaluable(list), ok20)) {
                                        if (!epx.f(stringToInteger.matchesArgumentsWithCast$div_evaluable(list), ok20)) {
                                            throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                        }
                                    }
                                }
                            }
                            return stringToInteger;
                        }
                        return numberToInteger;
                    }
                    return booleanToInteger;
                }
                break;
            case 374506968:
                if (str.equals("getDictOptString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptString.INSTANCE, list);
                }
                break;
            case 407302472:
                if (str.equals("setMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMillis.INSTANCE, list);
                }
                break;
            case 412791996:
                if (str.equals("getDictOptColor")) {
                    GetDictOptColorWithColorFallback getDictOptColorWithColorFallback = GetDictOptColorWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable21 = getDictOptColorWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok21 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable21, ok21)) {
                        GetDictOptColorWithStringFallback getDictOptColorWithStringFallback = GetDictOptColorWithStringFallback.INSTANCE;
                        if (!epx.f(getDictOptColorWithStringFallback.matchesArguments$div_evaluable(list), ok21)) {
                            if (!epx.f(getDictOptColorWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok21)) {
                                if (!epx.f(getDictOptColorWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok21)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getDictOptColorWithStringFallback;
                    }
                    return getDictOptColorWithColorFallback;
                }
                break;
            case 515198110:
                if (str.equals("decodeUri")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringDecodeUri.INSTANCE, list);
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringSubstring.INSTANCE, list);
                }
                break;
            case 579215519:
                if (str.equals("getBooleanValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanValue.INSTANCE, list);
                }
                break;
            case 609553469:
                if (str.equals("getOptUrlFromArray")) {
                    GetOptUrlFromArrayWithStringFallback getOptUrlFromArrayWithStringFallback = GetOptUrlFromArrayWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable22 = getOptUrlFromArrayWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok22 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable22, ok22)) {
                        GetOptUrlFromArrayWithUrlFallback getOptUrlFromArrayWithUrlFallback = GetOptUrlFromArrayWithUrlFallback.INSTANCE;
                        if (!epx.f(getOptUrlFromArrayWithUrlFallback.matchesArguments$div_evaluable(list), ok22)) {
                            if (!epx.f(getOptUrlFromArrayWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok22)) {
                                if (!epx.f(getOptUrlFromArrayWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok22)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getOptUrlFromArrayWithUrlFallback;
                    }
                    return getOptUrlFromArrayWithStringFallback;
                }
                break;
            case 621919548:
                if (str.equals("getMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMillis.INSTANCE, list);
                }
                break;
            case 624675145:
                if (str.equals("getIntegerValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerValue.INSTANCE, list);
                }
                break;
            case 648795069:
                if (str.equals("setSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetSeconds.INSTANCE, list);
                }
                break;
            case 671285057:
                if (str.equals("getDictOptBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptBoolean.INSTANCE, list);
                }
                break;
            case 757893007:
                if (str.equals("padStart")) {
                    PadStartInteger padStartInteger = PadStartInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable23 = padStartInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok23 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable23, ok23)) {
                        PadStartString padStartString = PadStartString.INSTANCE;
                        if (!epx.f(padStartString.matchesArguments$div_evaluable(list), ok23)) {
                            if (!epx.f(padStartInteger.matchesArgumentsWithCast$div_evaluable(list), ok23)) {
                                if (!epx.f(padStartString.matchesArgumentsWithCast$div_evaluable(list), ok23)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return padStartString;
                    }
                    return padStartInteger;
                }
                break;
            case 785010124:
                if (str.equals("getArrayUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayUrl.INSTANCE, list);
                }
                break;
            case 815452174:
                if (str.equals("getArrayOptInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptInteger.INSTANCE, list);
                }
                break;
            case 833284859:
                if (str.equals("getStoredUrlValue")) {
                    GetStoredUrlValueWithStringFallback getStoredUrlValueWithStringFallback = GetStoredUrlValueWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable24 = getStoredUrlValueWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok24 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable24, ok24)) {
                        GetStoredUrlValueWithUrlFallback getStoredUrlValueWithUrlFallback = GetStoredUrlValueWithUrlFallback.INSTANCE;
                        if (!epx.f(getStoredUrlValueWithUrlFallback.matchesArguments$div_evaluable(list), ok24)) {
                            if (!epx.f(getStoredUrlValueWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok24)) {
                                if (!epx.f(getStoredUrlValueWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok24)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getStoredUrlValueWithUrlFallback;
                    }
                    return getStoredUrlValueWithStringFallback;
                }
                break;
            case 851027282:
                if (str.equals("getOptUrlFromDict")) {
                    GetOptUrlFromDictWithStringFallback getOptUrlFromDictWithStringFallback = GetOptUrlFromDictWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable25 = getOptUrlFromDictWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok25 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable25, ok25)) {
                        GetOptUrlFromDictWithUrlFallback getOptUrlFromDictWithUrlFallback = GetOptUrlFromDictWithUrlFallback.INSTANCE;
                        if (!epx.f(getOptUrlFromDictWithUrlFallback.matchesArguments$div_evaluable(list), ok25)) {
                            if (!epx.f(getOptUrlFromDictWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok25)) {
                                if (!epx.f(getOptUrlFromDictWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok25)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getOptUrlFromDictWithUrlFallback;
                    }
                    return getOptUrlFromDictWithStringFallback;
                }
                break;
            case 902290499:
                if (str.equals("getArrayFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayFromDict.INSTANCE, list);
                }
                break;
            case 963997617:
                if (str.equals("getColorAlpha")) {
                    ColorAlphaComponentGetter colorAlphaComponentGetter = ColorAlphaComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable26 = colorAlphaComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok26 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable26, ok26)) {
                        ColorStringAlphaComponentGetter colorStringAlphaComponentGetter = ColorStringAlphaComponentGetter.INSTANCE;
                        if (!epx.f(colorStringAlphaComponentGetter.matchesArguments$div_evaluable(list), ok26)) {
                            if (!epx.f(colorAlphaComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok26)) {
                                if (!epx.f(colorStringAlphaComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok26)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringAlphaComponentGetter;
                    }
                    return colorAlphaComponentGetter;
                }
                break;
            case 968898065:
                if (str.equals("getStoredArrayValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredArrayValue.INSTANCE, list);
                }
                break;
            case 969706838:
                if (str.equals("getColorGreen")) {
                    ColorGreenComponentGetter colorGreenComponentGetter = ColorGreenComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable27 = colorGreenComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok27 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable27, ok27)) {
                        ColorStringGreenComponentGetter colorStringGreenComponentGetter = ColorStringGreenComponentGetter.INSTANCE;
                        if (!epx.f(colorStringGreenComponentGetter.matchesArguments$div_evaluable(list), ok27)) {
                            if (!epx.f(colorGreenComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok27)) {
                                if (!epx.f(colorStringGreenComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok27)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringGreenComponentGetter;
                    }
                    return colorGreenComponentGetter;
                }
                break;
            case 983060420:
                if (str.equals("getColorValue")) {
                    GetColorValue getColorValue = GetColorValue.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable28 = getColorValue.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok28 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable28, ok28)) {
                        GetColorValueString getColorValueString = GetColorValueString.INSTANCE;
                        if (!epx.f(getColorValueString.matchesArguments$div_evaluable(list), ok28)) {
                            if (!epx.f(getColorValue.matchesArgumentsWithCast$div_evaluable(list), ok28)) {
                                if (!epx.f(getColorValueString.matchesArgumentsWithCast$div_evaluable(list), ok28)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getColorValueString;
                    }
                    return getColorValue;
                }
                break;
            case 1012555088:
                if (str.equals("getNumberFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberFromArray.INSTANCE, list);
                }
                break;
            case 1022717043:
                if (str.equals("getOptDictFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptDictFromDict.INSTANCE, list);
                }
                break;
            case 1098852024:
                if (str.equals("getUrlValue")) {
                    GetUrlValueWithStringFallback getUrlValueWithStringFallback = GetUrlValueWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable29 = getUrlValueWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok29 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable29, ok29)) {
                        GetUrlValueWithUrlFallback getUrlValueWithUrlFallback = GetUrlValueWithUrlFallback.INSTANCE;
                        if (!epx.f(getUrlValueWithUrlFallback.matchesArguments$div_evaluable(list), ok29)) {
                            if (!epx.f(getUrlValueWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok29)) {
                                if (!epx.f(getUrlValueWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok29)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getUrlValueWithUrlFallback;
                    }
                    return getUrlValueWithStringFallback;
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable30 = integerDecimalFormat.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok30 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable30, ok30)) {
                        LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
                        if (!epx.f(localizedIntegerDecimalFormat.matchesArguments$div_evaluable(list), ok30)) {
                            LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
                            if (!epx.f(localizedNumberDecimalFormat.matchesArguments$div_evaluable(list), ok30)) {
                                NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
                                if (!epx.f(numberDecimalFormat.matchesArguments$div_evaluable(list), ok30)) {
                                    if (!epx.f(integerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok30)) {
                                        if (!epx.f(localizedIntegerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok30)) {
                                            if (!epx.f(localizedNumberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok30)) {
                                                if (!epx.f(numberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok30)) {
                                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                                }
                                            }
                                        }
                                    }
                                }
                                return numberDecimalFormat;
                            }
                            return localizedNumberDecimalFormat;
                        }
                        return localizedIntegerDecimalFormat;
                    }
                    return integerDecimalFormat;
                }
                break;
            case 1298006409:
                if (str.equals("getOptColorFromArray")) {
                    GetOptColorFromArrayWithColorFallback getOptColorFromArrayWithColorFallback = GetOptColorFromArrayWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable31 = getOptColorFromArrayWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok31 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable31, ok31)) {
                        GetOptColorFromArrayWithStringFallback getOptColorFromArrayWithStringFallback = GetOptColorFromArrayWithStringFallback.INSTANCE;
                        if (!epx.f(getOptColorFromArrayWithStringFallback.matchesArguments$div_evaluable(list), ok31)) {
                            if (!epx.f(getOptColorFromArrayWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok31)) {
                                if (!epx.f(getOptColorFromArrayWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok31)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getOptColorFromArrayWithStringFallback;
                    }
                    return getOptColorFromArrayWithColorFallback;
                }
                break;
            case 1309020812:
                if (str.equals("minInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(IntegerMinValue.INSTANCE, list);
                }
                break;
            case 1335732619:
                if (str.equals("getOptBooleanFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptBooleanFromDict.INSTANCE, list);
                }
                break;
            case 1346085543:
                if (str.equals("getStringFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringFromDict.INSTANCE, list);
                }
                break;
            case 1360482480:
                if (str.equals("setColorRed")) {
                    ColorRedComponentSetter colorRedComponentSetter = ColorRedComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable32 = colorRedComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok32 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable32, ok32)) {
                        ColorStringRedComponentSetter colorStringRedComponentSetter = ColorStringRedComponentSetter.INSTANCE;
                        if (!epx.f(colorStringRedComponentSetter.matchesArguments$div_evaluable(list), ok32)) {
                            if (!epx.f(colorRedComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok32)) {
                                if (!epx.f(colorStringRedComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok32)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringRedComponentSetter;
                    }
                    return colorRedComponentSetter;
                }
                break;
            case 1394182093:
                if (str.equals("setHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetHours.INSTANCE, list);
                }
                break;
            case 1398793022:
                if (str.equals("setMonth")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMonth.INSTANCE, list);
                }
                break;
            case 1428631719:
                if (str.equals("getIntegerFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerFromArray.INSTANCE, list);
                }
                break;
            case 1449062308:
                if (str.equals("getColorRed")) {
                    ColorRedComponentGetter colorRedComponentGetter = ColorRedComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable33 = colorRedComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok33 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable33, ok33)) {
                        ColorStringRedComponentGetter colorStringRedComponentGetter = ColorStringRedComponentGetter.INSTANCE;
                        if (!epx.f(colorStringRedComponentGetter.matchesArguments$div_evaluable(list), ok33)) {
                            if (!epx.f(colorRedComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok33)) {
                                if (!epx.f(colorStringRedComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok33)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringRedComponentGetter;
                    }
                    return colorRedComponentGetter;
                }
                break;
            case 1507829577:
                if (str.equals("trimLeft")) {
                    return FunctionValidatorKt.withArgumentsValidation(TrimLeft.INSTANCE, list);
                }
                break;
            case 1508134774:
                if (str.equals("encodeUri")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringEncodeUri.INSTANCE, list);
                }
                break;
            case 1565972102:
                if (str.equals("getOptColorFromDict")) {
                    GetOptColorFromDictWithColorFallback getOptColorFromDictWithColorFallback = GetOptColorFromDictWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable34 = getOptColorFromDictWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok34 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable34, ok34)) {
                        GetOptColorFromDictWithStringFallback getOptColorFromDictWithStringFallback = GetOptColorFromDictWithStringFallback.INSTANCE;
                        if (!epx.f(getOptColorFromDictWithStringFallback.matchesArguments$div_evaluable(list), ok34)) {
                            if (!epx.f(getOptColorFromDictWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok34)) {
                                if (!epx.f(getOptColorFromDictWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok34)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getOptColorFromDictWithStringFallback;
                    }
                    return getOptColorFromDictWithColorFallback;
                }
                break;
            case 1636968764:
                if (str.equals("getOptDictFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptDictFromArray.INSTANCE, list);
                }
                break;
            case 1644730933:
                if (str.equals("nowLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(NowLocal.INSTANCE, list);
                }
                break;
            case 1695311327:
                if (str.equals("getNumberFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberFromDict.INSTANCE, list);
                }
                break;
            case 1716172417:
                if (str.equals("getOptStringFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptStringFromArray.INSTANCE, list);
                }
                break;
            case 1738128829:
                if (str.equals("setColorAlpha")) {
                    ColorAlphaComponentSetter colorAlphaComponentSetter = ColorAlphaComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable35 = colorAlphaComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok35 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable35, ok35)) {
                        ColorStringAlphaComponentSetter colorStringAlphaComponentSetter = ColorStringAlphaComponentSetter.INSTANCE;
                        if (!epx.f(colorStringAlphaComponentSetter.matchesArguments$div_evaluable(list), ok35)) {
                            if (!epx.f(colorAlphaComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok35)) {
                                if (!epx.f(colorStringAlphaComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok35)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringAlphaComponentSetter;
                    }
                    return colorAlphaComponentSetter;
                }
                break;
            case 1743838050:
                if (str.equals("setColorGreen")) {
                    ColorGreenComponentSetter colorGreenComponentSetter = ColorGreenComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable36 = colorGreenComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok36 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable36, ok36)) {
                        ColorStringGreenComponentSetter colorStringGreenComponentSetter = ColorStringGreenComponentSetter.INSTANCE;
                        if (!epx.f(colorStringGreenComponentSetter.matchesArguments$div_evaluable(list), ok36)) {
                            if (!epx.f(colorGreenComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok36)) {
                                if (!epx.f(colorStringGreenComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok36)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringGreenComponentSetter;
                    }
                    return colorGreenComponentSetter;
                }
                break;
            case 1745084820:
                if (str.equals("getIntervalHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalHours.INSTANCE, list);
                }
                break;
            case 1814686973:
                if (str.equals("getBooleanFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanFromArray.INSTANCE, list);
                }
                break;
            case 1883462358:
                if (str.equals("getIntervalTotalMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalMinutes.INSTANCE, list);
                }
                break;
            case 1907630144:
                if (str.equals("getDictKeys")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictKeys.INSTANCE, list);
                }
                break;
            case 1910382545:
                if (str.equals("encodeRegex")) {
                    return FunctionValidatorKt.withArgumentsValidation(EncodeRegex.INSTANCE, list);
                }
                break;
            case 1953671716:
                if (str.equals("getIntervalMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalMinutes.INSTANCE, list);
                }
                break;
            case 1953831815:
                if (str.equals("getStoredStringValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredStringValue.INSTANCE, list);
                }
                break;
            case 1955294553:
                if (str.equals("getHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetHours.INSTANCE, list);
                }
                break;
            case 1959905482:
                if (str.equals("getMonth")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMonth.INSTANCE, list);
                }
                break;
            case 1970789287:
                if (str.equals("getColorBlue")) {
                    ColorBlueComponentGetter colorBlueComponentGetter = ColorBlueComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable37 = colorBlueComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok37 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable37, ok37)) {
                        ColorStringBlueComponentGetter colorStringBlueComponentGetter = ColorStringBlueComponentGetter.INSTANCE;
                        if (!epx.f(colorStringBlueComponentGetter.matchesArguments$div_evaluable(list), ok37)) {
                            if (!epx.f(colorBlueComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok37)) {
                                if (!epx.f(colorStringBlueComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok37)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return colorStringBlueComponentGetter;
                    }
                    return colorBlueComponentGetter;
                }
                break;
            case 1975049074:
                if (str.equals("getDictInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictInteger.INSTANCE, list);
                }
                break;
            case 1985132479:
                if (str.equals("setYear")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetYear.INSTANCE, list);
                }
                break;
            case 1992807388:
                if (str.equals("lastIndex")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringLastIndex.INSTANCE, list);
                }
                break;
            case 2033316403:
                if (str.equals("getArrayOptColor")) {
                    GetArrayOptColorWithColorFallback getArrayOptColorWithColorFallback = GetArrayOptColorWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable38 = getArrayOptColorWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok38 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable38, ok38)) {
                        GetArrayOptColorWithStringFallback getArrayOptColorWithStringFallback = GetArrayOptColorWithStringFallback.INSTANCE;
                        if (!epx.f(getArrayOptColorWithStringFallback.matchesArguments$div_evaluable(list), ok38)) {
                            if (!epx.f(getArrayOptColorWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok38)) {
                                if (!epx.f(getArrayOptColorWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok38)) {
                                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                                }
                            }
                        }
                        return getArrayOptColorWithStringFallback;
                    }
                    return getArrayOptColorWithColorFallback;
                }
                break;
            case 2075646548:
                if (str.equals("formatDateAsLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsLocal.INSTANCE, list);
                }
                break;
            case 2101762217:
                if (str.equals("getMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMinutes.INSTANCE, list);
                }
                break;
            case 2135485098:
                if (str.equals("getStringValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringValue.INSTANCE, list);
                }
                break;
        }
        throw new EvaluableException(air.b(JwtParser.SEPARATOR_CHAR, "Unknown function name: ", str), null, 2, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function getMethod(String str, List<? extends EvaluableType> list) {
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    ArrayToString arrayToString = ArrayToString.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable = arrayToString.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable, ok)) {
                        BooleanToString booleanToString = BooleanToString.INSTANCE;
                        if (!epx.f(booleanToString.matchesArguments$div_evaluable(list), ok)) {
                            ColorToString colorToString = ColorToString.INSTANCE;
                            if (!epx.f(colorToString.matchesArguments$div_evaluable(list), ok)) {
                                DictToString dictToString = DictToString.INSTANCE;
                                if (!epx.f(dictToString.matchesArguments$div_evaluable(list), ok)) {
                                    IntegerToString integerToString = IntegerToString.INSTANCE;
                                    if (!epx.f(integerToString.matchesArguments$div_evaluable(list), ok)) {
                                        NumberToString numberToString = NumberToString.INSTANCE;
                                        if (!epx.f(numberToString.matchesArguments$div_evaluable(list), ok)) {
                                            StringToString stringToString = StringToString.INSTANCE;
                                            if (!epx.f(stringToString.matchesArguments$div_evaluable(list), ok)) {
                                                UrlToString urlToString = UrlToString.INSTANCE;
                                                if (!epx.f(urlToString.matchesArguments$div_evaluable(list), ok)) {
                                                    if (!epx.f(arrayToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                        if (!epx.f(booleanToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                            if (!epx.f(colorToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                                if (!epx.f(dictToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                                    if (!epx.f(integerToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                                        if (!epx.f(numberToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                                            if (!epx.f(stringToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                                                if (!epx.f(urlToString.matchesArgumentsWithCast$div_evaluable(list), ok)) {
                                                                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return urlToString;
                                            }
                                            return stringToString;
                                        }
                                        return numberToString;
                                    }
                                    return integerToString;
                                }
                                return dictToString;
                            }
                            return colorToString;
                        }
                        return booleanToString;
                    }
                    return arrayToString;
                }
                break;
            case -1300054776:
                if (str.equals("getInteger")) {
                    ArrayGetInteger arrayGetInteger = ArrayGetInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable2 = arrayGetInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok2 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable2, ok2)) {
                        GetInteger getInteger = GetInteger.INSTANCE;
                        if (!epx.f(getInteger.matchesArguments$div_evaluable(list), ok2)) {
                            if (!epx.f(arrayGetInteger.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                if (!epx.f(getInteger.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getInteger;
                    }
                    return arrayGetInteger;
                }
                break;
            case -1249348039:
                if (str.equals("getUrl")) {
                    ArrayGetUrl arrayGetUrl = ArrayGetUrl.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable3 = arrayGetUrl.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok3 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable3, ok3)) {
                        GetUrl getUrl = GetUrl.INSTANCE;
                        if (!epx.f(getUrl.matchesArguments$div_evaluable(list), ok3)) {
                            if (!epx.f(arrayGetUrl.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                                if (!epx.f(getUrl.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getUrl;
                    }
                    return arrayGetUrl;
                }
                break;
            case -75598804:
                if (str.equals("getDict")) {
                    ArrayGetDict arrayGetDict = ArrayGetDict.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable4 = arrayGetDict.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok4 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable4, ok4)) {
                        GetDict getDict = GetDict.INSTANCE;
                        if (!epx.f(getDict.matchesArguments$div_evaluable(list), ok4)) {
                            if (!epx.f(arrayGetDict.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                                if (!epx.f(getDict.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getDict;
                    }
                    return arrayGetDict;
                }
                break;
            case -75393430:
                if (str.equals("getKeys")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetKeys.INSTANCE, list);
                }
                break;
            case 208013248:
                if (str.equals("containsKey")) {
                    return FunctionValidatorKt.withArgumentsValidation(DictContainsKey.INSTANCE, list);
                }
                break;
            case 661651007:
                if (str.equals("getNumber")) {
                    ArrayGetNumber arrayGetNumber = ArrayGetNumber.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable5 = arrayGetNumber.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok5 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable5, ok5)) {
                        GetNumber getNumber = GetNumber.INSTANCE;
                        if (!epx.f(getNumber.matchesArguments$div_evaluable(list), ok5)) {
                            if (!epx.f(arrayGetNumber.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                                if (!epx.f(getNumber.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getNumber;
                    }
                    return arrayGetNumber;
                }
                break;
            case 804029191:
                if (str.equals("getString")) {
                    ArrayGetString arrayGetString = ArrayGetString.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable6 = arrayGetString.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok6 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable6, ok6)) {
                        GetString getString = GetString.INSTANCE;
                        if (!epx.f(getString.matchesArguments$div_evaluable(list), ok6)) {
                            if (!epx.f(arrayGetString.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                                if (!epx.f(getString.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getString;
                    }
                    return arrayGetString;
                }
                break;
            case 872202264:
                if (str.equals("getValues")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetValues.INSTANCE, list);
                }
                break;
            case 1101572082:
                if (str.equals("getBoolean")) {
                    ArrayGetBoolean arrayGetBoolean = ArrayGetBoolean.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable7 = arrayGetBoolean.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok7 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable7, ok7)) {
                        GetBoolean getBoolean = GetBoolean.INSTANCE;
                        if (!epx.f(getBoolean.matchesArguments$div_evaluable(list), ok7)) {
                            if (!epx.f(arrayGetBoolean.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                                if (!epx.f(getBoolean.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getBoolean;
                    }
                    return arrayGetBoolean;
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable8 = integerDecimalFormat.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok8 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable8, ok8)) {
                        LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
                        if (!epx.f(localizedIntegerDecimalFormat.matchesArguments$div_evaluable(list), ok8)) {
                            LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
                            if (!epx.f(localizedNumberDecimalFormat.matchesArguments$div_evaluable(list), ok8)) {
                                NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
                                if (!epx.f(numberDecimalFormat.matchesArguments$div_evaluable(list), ok8)) {
                                    if (!epx.f(integerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                                        if (!epx.f(localizedIntegerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                                            if (!epx.f(localizedNumberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                                                if (!epx.f(numberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                                }
                                            }
                                        }
                                    }
                                }
                                return numberDecimalFormat;
                            }
                            return localizedNumberDecimalFormat;
                        }
                        return localizedIntegerDecimalFormat;
                    }
                    return integerDecimalFormat;
                }
                break;
            case 1948915875:
                if (str.equals("getArray")) {
                    ArrayGetArray arrayGetArray = ArrayGetArray.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable9 = arrayGetArray.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok9 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable9, ok9)) {
                        GetArray getArray = GetArray.INSTANCE;
                        if (!epx.f(getArray.matchesArguments$div_evaluable(list), ok9)) {
                            if (!epx.f(arrayGetArray.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                                if (!epx.f(getArray.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getArray;
                    }
                    return arrayGetArray;
                }
                break;
            case 1950668205:
                if (str.equals("getColor")) {
                    ArrayGetColor arrayGetColor = ArrayGetColor.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable10 = arrayGetColor.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok10 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable10, ok10)) {
                        GetColor getColor = GetColor.INSTANCE;
                        if (!epx.f(getColor.matchesArguments$div_evaluable(list), ok10)) {
                            if (!epx.f(arrayGetColor.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                                if (!epx.f(getColor.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return getColor;
                    }
                    return arrayGetColor;
                }
                break;
            case 2058039875:
                if (str.equals("isEmpty")) {
                    ArrayIsEmpty arrayIsEmpty = ArrayIsEmpty.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable11 = arrayIsEmpty.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok11 = Function.MatchResult.Ok.INSTANCE;
                    if (!epx.f(matchesArguments$div_evaluable11, ok11)) {
                        DictIsEmpty dictIsEmpty = DictIsEmpty.INSTANCE;
                        if (!epx.f(dictIsEmpty.matchesArguments$div_evaluable(list), ok11)) {
                            if (!epx.f(arrayIsEmpty.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                                if (!epx.f(dictIsEmpty.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                                }
                            }
                        }
                        return dictIsEmpty;
                    }
                    return arrayIsEmpty;
                }
                break;
        }
        throw new EvaluableException(air.b(JwtParser.SEPARATOR_CHAR, "Unknown method name: ", str), null, 2, null);
    }
}
